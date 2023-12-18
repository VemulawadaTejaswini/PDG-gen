import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	double max = Double.MIN_VALUE;
	double min = Double.MAX_VALUE;
	while(sc.hasNext()){
	    double mountain = sc.nextDouble();

	    if(mountain>max){max = mountain;}
	    if(mountain<min){min = mountain;}

	}

	System.out.println(max-min);
    }
}