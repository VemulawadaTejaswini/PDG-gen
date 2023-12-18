import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int a=0;
        for(int i=0;i<=x;i++) {
        	int j=x-i;
        	if(2*i+4*j==y) {
        		System.out.println("Yes");
        		a=1;
        	}
        }
        if(a==0)	System.out.println("No");
    }
}