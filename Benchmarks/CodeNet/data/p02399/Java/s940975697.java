import java.util.*;

class Main{
    Scanner sc = new Scanner(System.in);

    Main(){
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.print( (a/b)+" "+(a%b)+" " );
	System.out.printf("%.8f\n", (double)a/b );
    }

    public static void main(String[] args){
	new Main();
    }
}