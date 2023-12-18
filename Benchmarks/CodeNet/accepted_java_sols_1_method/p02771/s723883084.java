import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
        int A = stdIn.nextInt();
	int B = stdIn.nextInt();
	int C = stdIn.nextInt();
	if((A==B&&A==C)||(A!=B&&A!=C&&B!=C)){
	    System.out.println("No");
	}else{
	    System.out.println("Yes");
	}
    }
}
