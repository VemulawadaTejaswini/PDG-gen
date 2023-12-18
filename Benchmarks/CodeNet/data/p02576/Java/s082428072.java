import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
        int t=sc.nextInt();
        int s=0;
        if(n%k==0) {
        	s=n/k;
        }
        else {
        	s=n/k+1;
        }
        System.out.println(t*s);

		
	}
}