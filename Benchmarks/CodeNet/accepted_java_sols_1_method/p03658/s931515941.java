import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[]l = new int[n];
    
    for(int i=0; i<n; i++) {
    	l[i] = sc.nextInt();
    }
    Arrays.sort(l);
    int all = 0;
    int hiku = 0;
    for(int i=0; i<n; i++) {
    	all += l[i]; 
    }
    for(int i=0; i<n-k; i++) {
    	hiku += l[i];
    }
    System.out.print(all-hiku);
    }
}
