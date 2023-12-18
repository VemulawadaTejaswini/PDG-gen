import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int[]x = new int[n];
    int[]y = new int[m];
 
    for(int i=0; i<n; i++) {
    	x[i] = sc.nextInt();
    }
    Arrays.sort(x);
    for(int i=0; i<m; i++) {
    	y[i] = sc.nextInt();
    }
    Arrays.sort(y);
    if(x[n-1]+1 <= y[0]){
    	if(X < x[n-1]+1 && x[n-1]+1 <= Y) {
    	System.out.println("No War");
    	}else {
       		System.out.println("War");
    	}
    }else {
   		System.out.println("War");
   	}
    }
}
