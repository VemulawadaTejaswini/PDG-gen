import java.util.*;
public class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int n=s.nextInt(),count=0;
		BitSet b=new BitSet(n+1);

		int buf;
		for(int i=0;i<n;i++) {
			buf=s.nextInt();
			if(b.get(buf)) count++;
			b.set(buf);
		}

		//System.out.println(count+count%2);
		System.out.println(n-(count+count%2));
	}
}
