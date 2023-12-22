import java.util.*;
public class Main {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) {
		int N=sc.nextInt(),res=0;
		for(int i=0;i<N;i++) {
			long temp=sc.nextLong();
			while((temp&1)==0) {
				res++;
				temp=temp>>1;;
			}
		}
		System.out.println(res);
	}
}