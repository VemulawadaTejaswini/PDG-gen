import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int a,b;
	double log;

	while(s.hasNextInt()){

	    a=s.nextInt();
	    b=s.nextInt();

	    log=Math.log10(a+b+1);

	    System.out.printf("%.0f\n",Math.ceil(log));

	}

    }

}