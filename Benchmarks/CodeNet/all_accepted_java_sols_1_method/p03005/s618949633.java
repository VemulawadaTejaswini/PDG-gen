import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt(); //個数
		int k = stdIn.nextInt(); //人数
		
		if(k==1){
			System.out.println(0);
		}else{
			System.out.println(n-k);
		}


	}
}