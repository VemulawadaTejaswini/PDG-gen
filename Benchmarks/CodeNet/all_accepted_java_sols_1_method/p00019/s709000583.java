import java.util.*;
class Main{
	public static void main(String[]agrs){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()){
			
		int n=sc.nextInt();
		int a[]=new int[n];
		int b=0;long c=1;
		for(int i=0;i<a.length;i++){
			a[i]=n-b;
			b++;
		}
		for(int j=0;j<a.length;j++){
			c*=a[j];
			
		}
		
		System.out.println(c);
	}
		
	}
}