import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int N = scan.nextInt();
      	int K = scan.nextInt();
      	int nokori = N - K ;
      	if(K == 1) {
        	System.out.print(0);
        }
      	else {
      	System.out.print(nokori);
        }
    }

}