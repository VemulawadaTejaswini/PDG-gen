
import java.util.Scanner;
public class Main {
	 public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int i, a, b, c, d;
	  int n = sc.nextInt();
	  int [] x = new int[n+1];
	  int [] y = new int[n+1];
	  for(i = 0; i < n*(n-1)/2; i++){
	   a = sc.nextInt();
	   b = sc.nextInt();
	   c = sc.nextInt();
	   d = sc.nextInt();
	   if(c>d) x[a] += 3;
	   else if(c<d) x[b] += 3;
	   else{
	    x[a] += 1;
	    x[b] += 1;
	   }
	  }
	  for(int j = 1; j <= n; j++){
	   for(int h = 1; h <= n; h++){
	    if(x[j] < x[h]) y[j] += 1;
	   }
	  }
	  for(int k = 1; k < n+1; k++)
	   System.out.println(y[k] + 1);
	 }
	}