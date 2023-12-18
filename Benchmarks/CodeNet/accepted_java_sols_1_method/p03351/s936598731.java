import java.util.*;

public class Main{

    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int d = sc.nextInt();

	boolean ab = false;
	boolean bc = false;
	

	if(a>=b && a-b<=d) ab = true;

	if(a<=b && b-a<=d) ab = true;

	if(b>=c && b-c<=d) bc = true;

	if(b<=c && c-b<=d) bc = true;


	if(a>=c && a-c<=d){
	    ab =true;
	    bc = true;
	}

	if(a<=c && c-a<=d){
	    ab = true;
	    bc = true;
	}
	if(ab == true && bc == true){

	    System.out.println("Yes");
	}else{
	    System.out.println("No");
	}

					
    }
}
