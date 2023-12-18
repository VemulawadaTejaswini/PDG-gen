import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.function.LongSupplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static final long[] fal_rnd(long[] ar,LongSupplier sp){
		int l=-1,r=ar.length;
		while(l+1!=r)
			ar[Math.random()<0.5?++l:--r]=sp.getAsLong();
		return ar;
	}
	static final IntStream REPS(int v){return IntStream.range(0, v);};
	public static void main(String[] __){
		final char[][] v=Stream.of(".,!? ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz").map(o->o.toCharArray()).toArray(char[][]::new);
		for(int n=s.nextInt();n>0;n--) {
			ArrayDeque<Character> r=new ArrayDeque<>();
			char last='0';
			int index=0;
			for(char c:s.next().replaceFirst("^0+", "").replaceAll("00+", "0").toCharArray()) {
				if(c=='0') {
					last=c;
					continue;
				}
				if(last=='0') {
					r.add(v[c-'1'][index=0]);
				}else {
					r.pollLast();
					index=(index+1)%v[c-'1'].length;
					r.add(v[c-'1'][index]);
				}
				last=c;
 			}
			System.out.println(r.toString().replaceAll("(\\[|\\]|, )",""));
		}
	}
}