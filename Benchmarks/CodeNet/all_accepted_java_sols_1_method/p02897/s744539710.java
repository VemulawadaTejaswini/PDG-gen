import java.util.*;
public class Main
{
	public static void main(String[] args)
    {
      	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
      	double prob = 0;
      	if(n % 2 == 0) prob = 0.5;
      	else{
        	prob = ((n + 1) / 2.0) / (double)n;
        }
      	System.out.println(prob);
    }
}