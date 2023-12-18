import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[]d = new int[n];

    int all = 0;
    int hiku = 0;
    for(int i=0; i<n; i++) {
    	d[i] = sc.nextInt();
    	hiku += d[i]*d[i];		
    }
    for(int i=0; i<n; i++) {
    for(int j=0; j<n; j++) {	
    	all += d[i]*d[j];
    }
    }
    	System.out.println((all-hiku)/2);
      }
}