import java.util.*;
 
class Main {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		int i;
		long s=1;
		
		for(i=2;i<=n;i++)
		s*=i;
		
		System.out.println(s);
        
    }
}