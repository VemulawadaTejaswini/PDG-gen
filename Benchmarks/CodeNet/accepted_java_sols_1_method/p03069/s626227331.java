import java.util.Scanner;


public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n =sc.nextInt();
		String s=sc.next();

		char c[]=new char[n];
		int blackcount=0;
		int blacknum=0;
		int min=n;

		for(int i=0;i<n;++i){
			if(s.charAt(i)=='#')++blacknum;

		}
		for(int i=0;i<n;++i){
			if(s.charAt(i)=='#'){
				++blackcount;
				min=Math.min(min, blackcount-1+(n-1-i)-blacknum+blackcount);
			}
			else min=Math.min(min, blackcount+(n-1-i)-blacknum+blackcount);
		}

		System.out.println(min);


	}
}