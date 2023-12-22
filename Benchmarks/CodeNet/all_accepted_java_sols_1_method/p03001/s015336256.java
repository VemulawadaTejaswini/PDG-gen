import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		double w = scn.nextDouble();
      	double h = scn.nextDouble();
      	double x = scn.nextDouble();
      	double y = scn.nextDouble();
      	double ans = w*h/2;
      	int check = 0;
      	if(x==w/2 && y==h/2) check = 1;
      	System.out.println(ans + " " + check);
	}
}
