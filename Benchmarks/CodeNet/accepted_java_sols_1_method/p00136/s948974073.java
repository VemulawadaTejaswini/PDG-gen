import java.util.*;

public class Main{
    public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int[] x = new int[6];

	for(int i = 0 ; i < 6 ; ++i){
	    x[i] = 0;
	}
	
	for(int i = 0 ; i < n ; ++i){
	    double a = scan.nextDouble();
	    if(a < 165.0)
		x[0]++;
	    else if(a < 170)
		x[1]++;
	    else if(a < 175)
		x[2]++;
	    else if(a < 180)
		x[3]++;
	    else if(a < 185)
		x[4]++;
	    else
		x[5]++;	
	}
	for(int i = 0 ; i < 6 ; ++i){
	    System.out.print((i+1) + ":");
	    for(int j = 0 ; j < x[i] ; ++j){
		System.out.print("*");
	    }
	    System.out.println();
	}
    }
}