import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
      
        int N = scan.nextInt();
      	long ans = 1;
		for(int i = 0; i < N; i++){
        	ans *= (long)scan.nextInt();
        }
      	if(Long.parseLong(Long.toString(ans).length())) < 18){
        	System.out.println(ans);
        }else{
          	System.out.println(-1);
        }
      	
    }
}