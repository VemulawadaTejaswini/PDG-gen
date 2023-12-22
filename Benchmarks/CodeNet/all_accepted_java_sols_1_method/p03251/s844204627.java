import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	int m = scan.nextInt();
	int X = scan.nextInt();
	int Y = scan.nextInt();
	int[] x = new int[n];
	int[] y = new int[m];
	for(int i = 0; i < n; i++){
	    x[i] = scan.nextInt();
	}
	for(int i = 0; i < m; i++){
	    y[i] = scan.nextInt();
	}

	Arrays.sort(x);
	Arrays.sort(y);

	if(x[n-1] > y[0]){
	    System.out.println("War");
	}else{
	    String z = "NO";
	    for(int i = x[n-1]+1; i <= y[0]; i++){
		if(X < i && i <= Y){
		    z = "YES";
		}
	    }
	    if(z.equals("YES")){
		System.out.println("No War");
	    }else{
		System.out.println("War");
	    }
	}
    }
}
