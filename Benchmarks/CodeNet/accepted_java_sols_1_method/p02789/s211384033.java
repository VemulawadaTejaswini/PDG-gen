import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
	int M = stdIn.nextInt();
	if(N>=M){
	    if(N==M){
		System.out.println("Yes");
	    }else{
		System.out.println("No");
	    }
	}
    }
}
