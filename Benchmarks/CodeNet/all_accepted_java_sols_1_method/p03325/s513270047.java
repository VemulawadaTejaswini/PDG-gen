import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] a=new long[N];
		for(int i=0;i<N;i++) a[i]=sc.nextLong();
		
		int sol=0;
		for(long v:a){
			while((v&1)==0){
				v>>=1;sol++;
			}
		}
		System.out.println(sol);
	}

}
