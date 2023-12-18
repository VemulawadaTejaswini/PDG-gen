import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	int a,b,hz,rem;
	Scanner scan =new Scanner(System.in);
	a=scan.nextInt();
	b=scan.nextInt();
	if(b>a){
	    hz=a;
	    a=b;
	    b=hz;
	}
	rem=a%b;
        while(rem!=0){
	    a=b;
	    b=rem;
	    rem=a%b;
	}
	System.out.println(b);
    }
}

