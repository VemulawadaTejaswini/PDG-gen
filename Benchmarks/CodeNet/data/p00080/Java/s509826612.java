import java.util.*;

class Main{

    void run(){
	Scanner sc=new Scanner(System.in);

	while(true){
	    int q=sc.nextInt();if(q==-1)break;

	    double x=((double)q)/2;

	    while(Math.abs(x*x*x-q)>=0.00001*q){
		x=x-(x*x*x-q)/(3*x*x);
		//System.out.println(x);
	    }

	    System.out.println(x);
	}
    }

    public static void main(String[] args){
	new Main().run();
    }
}