import java.awt.Point;
import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static long[] fal_rnd(int size){
		AtomicInteger l=new AtomicInteger(-1),r=new AtomicInteger(size);
		long[] res=new long[size];
		INS(size).unordered().parallel().mapToLong(Long::parseLong).forEach(v->res[ThreadLocalRandom.current().nextBoolean()?l.incrementAndGet():r.decrementAndGet()]=v);
		return res;
	}
	static IntStream REPS(int v){
		return IntStream.range(0,v);
	}
	static Stream<String> INS(long size){
		return StreamSupport.stream(Spliterators.spliterator(s,size,Spliterator.NONNULL&Spliterator.IMMUTABLE),false).limit(size);
	}
	
	static long r,c;
	public static void main(String[] __){
		while(true){
			c=s.nextInt();
			r=s.nextInt();
			if(r+c==0) return;
			char[][] f=INS(r).map(String::toCharArray).toArray(char[][]::new);
			
			
			ArrayDeque<Point> deque=new ArrayDeque<>();
			
			serachStart:
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
					if(f[i][j]=='@'){
						deque.add(new Point(i,j));
						f[i][j]='#';
						break serachStart;
					}
				}
			}
			int res=1;
			while(!deque.isEmpty()){
				for(int l=deque.size();l>0;l--){
					Point poll=deque.pollFirst();
					for(int d=0;d<dr.length;d++) {
						Point p=(Point)(poll.clone());
						p.translate(dr[d],dc[d]);
						if(ranged(p)&&f[p.x][p.y]=='.') {
							deque.addLast(p);
							f[p.x][p.y]='#';
							res++;
						}
					}
				}
			}
			System.out.println(res);
		}
	}
	static int[] dr={0,1,0,-1},dc={-1,0,1,0};
	static boolean ranged(Point p){
		return 0<=p.x&&p.x<r&&0<=p.y&&p.y<c;
	}
}