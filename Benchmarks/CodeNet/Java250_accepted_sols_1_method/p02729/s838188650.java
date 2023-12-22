import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
   
    int a = 0;
    for(int i=1; i<n; i++) {
    	a += i;
    }
    int b = 0;
    for(int i=1; i<m; i++) {
    	b += i;
    }
    	System.out.println(a+b);
   }
}
