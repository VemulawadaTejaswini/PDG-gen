import java.util.*;
public class Main {
static int A= 0;


	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		A=sc.nextInt();
		int T= 52;
		int S=0;
		int count=0;
		int B =0;
		int C= 0;
		int data []=new int[A];
		
		for(int i=0;i<A;i++) {
		data[i] =sc.nextInt();	
		C = data[i];
		if(B > C) {
			
			if(T==52) {
				
				T=i-1;
				
			}else {
				
				S=i;
				
			}

			count++;
			if(count>2) break;
		}
		B= data[i];
		
		}
		if(count>2) {
			System.out.println("NO");
		}else {
		   if(T!=52 && S!=0) {
			int temp=data[T];
			data[T]=data[S];
			data[S]=temp;
		   }
			for(int i=0;i<A;i++) {
				if(i==A-1) {
					System.out.println("YES");

				}else if( data[i]>data[i+1]) {
					System.out.println("NO");
					break;
				}
		}
		
		

	}
}
}
