import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	long N =Long.parseLong(stdIn.next());
	int K = stdIn.nextInt();
	int count=0;
	while(N!=0){
	    N/=K;
	    count++;
	}
	System.out.println(count);
    }
}
	    
