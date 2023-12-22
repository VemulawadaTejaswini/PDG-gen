import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[]a = new int[N];
    		
    for(int i=0; i<N; i++) {
    	a[i] = sc.nextInt();
    }
    Arrays.sort(a);

    int x = 0;
    int y = 0;
    for(int i=0; i<N; i++) {
    	if(i%2==0) {
    		x += a[i];
    	}else {
    		y += a[i];
    	}
    	}
    System.out.println(Math.abs(x-y));
    }
}