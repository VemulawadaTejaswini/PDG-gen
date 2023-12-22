import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[]a = new int[n];

    double all = 0;
    for(int i=0; i<n; i++) {
    	a[i] = sc.nextInt();
    	all += (double)1.0/a[i];
    }   	
     	System.out.println(1.0/all);
    }
}