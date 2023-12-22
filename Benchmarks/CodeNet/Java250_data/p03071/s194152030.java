import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
        int A = stdIn.nextInt();
	int B = stdIn.nextInt();
	int k =A+A-1;
	if(A==B){
	    k=A+B;
	}
	if(A<B){
	    k=B+B-1;
	}
	System.out.println(k);
    }
}
