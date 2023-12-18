import java.util.*;

class Main{
	static public void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		long a=sc.nextInt();
		long b=1;
		try{
		for(int i=0;i<a;i++){
			long c=sc.nextInt();
			b*=c;
		}
	long num=100000000000000000L;
		
		System.out.println(b);
		}catch(InputMismatchException e){
			System.out.println(-1);
		}
	}
}