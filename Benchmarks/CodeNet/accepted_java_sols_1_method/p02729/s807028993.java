
import java.util.*;

public class Main {
	static public void main(String args[]){
		Scanner sc=new Scanner(System.in);
		 
		 int n=sc.nextInt();
		 int m=sc.nextInt();
		 if(m<2)m=0;
		 
		 n*=n-1; n/=2;
		 m*=m-1; m/=2;
		 System.out.print(n+m);
	}
}