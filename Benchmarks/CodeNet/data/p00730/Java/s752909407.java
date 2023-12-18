import java.util.*;
import java.util.stream.*;

class Piece{
	int h,w;

	public Piece(int w,int h){
		this.h=h;
		this.w=w;
	}

	int area(){
		return h*w;
	}

	@Override
	public String toString(){
		return "[("+w+", "+h+"), "+area()+"]";
	}
}

public class Main{

	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		ArrayList<Piece> l=new ArrayList<>();
		while(true){
			l.clear();
			int cut=s.nextInt();
			{
				Piece p=new Piece(s.nextInt(),s.nextInt());
				if(p.w==0)
					return;
				l.add(p);
			}
			for(int c=0;c<cut;++c){
				Piece p=l.remove(s.nextInt()-1),a,b;
				int w=p.w,h=p.h,k=s.nextInt()%(h*2+w*2);
				if(k<w||(w+h<k&&k<w*2+h)){
					k%=w+h;
					a=new Piece(k,h);
					b=new Piece(w-k,h);
				}else{
					k%=w+h;
					k-=w;
					a=new Piece(w,k);
					b=new Piece(w,h-k);
				}
				if(a.area()>b.area()){
					Piece t=a;
					a=b;
					b=t;
				}
				l.add(a);
				l.add(b);
			}
			System.out.println(
					l.stream().mapToInt(Piece::area)
							.filter(o->o>0)
							.sorted()
							.mapToObj(String::valueOf)
							.collect(Collectors.joining(" ")));
		}
	}
}
