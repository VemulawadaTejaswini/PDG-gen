import java.util.*;
public class Main {
 public static void main(String args[]) {
	 Scanner sc =new Scanner(System.in);
	 int N =sc.nextInt();
	 int D=sc.nextInt();
	 int t=D*2+1;
	 int ans=N%t;
	 int ans2=(int)N/t;
	
	 if(ans==0) {
		 
	 }else {
		 ans2++;
	 }
	 System.out.println(ans2);
	 

	 
 }
}

