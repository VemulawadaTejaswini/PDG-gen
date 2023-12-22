import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
	int A = stdIn.nextInt();
	int B = stdIn.nextInt();
	int t = N*A;
	if(t>B){
	    t = B;
	}
	System.out.println(t);
    }
}
