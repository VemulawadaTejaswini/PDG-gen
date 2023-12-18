import java.util.*;
public class Main {
 public static void main(String args[]) {
	 Scanner sc =new Scanner(System.in);
	 int N = sc.nextInt();
	 int data[]=new int[N];
	 int max1=0;
	 int max2=0;
	 int t1=0;
	 int t2=0;
	 
	 for(int i=0;i<N;i++) {
		 data[i]=sc.nextInt();
		 if(max1 <=data[i]) {
			 
	
			 max2=max1;
			 max1=data[i];
			
			 t2  = t1;
			 t1  = i;
			 
		 }else if(max2<=data[i]){

			 max2= data[i];
			 t2  = i;
		
	 }
	 }
	 for(int i=0;i<N;i++) {
		if(i==t1) {
			System.out.println(max2);
		}else {
			System.out.println(max1);
		}
		 
	 }
	 

	 
 }
}

