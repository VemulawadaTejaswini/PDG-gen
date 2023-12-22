import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);
	    int n = read.nextInt();
	    int x[] = new int[n];
	    for(int i=0; i<n; i++){
	        x[i] = read.nextInt();
	    }
	    int c = 0;
	    for(int i=0; i<n; i++){
	        if (i == 0 || i == n-1){
	            continue;
	        }else if((x[i] < x[i-1] && x[i] > x[i+1]) || (x[i] < x[i+1] && x[i] > x[i-1])){
	            c++;
	        }
	    }
		System.out.println(c);
	}
}