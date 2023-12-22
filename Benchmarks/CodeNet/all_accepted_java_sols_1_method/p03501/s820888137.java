import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
	int A = stdIn.nextInt();
	int B = stdIn.nextInt();
	int min = A*N;
	if(min>B){
	    min=B;
	}
	System.out.println(min);
    }
}
	
