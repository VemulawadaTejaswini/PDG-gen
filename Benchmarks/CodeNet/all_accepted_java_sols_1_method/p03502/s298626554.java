import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		//方針f(x)つまり各桁の合計でfxわれれば正解
      		String[] numberStrSplit = N.split("");
		//それぞれ数値にしてたす
		int suutiSum = 0;
		for(int i = 0;i < numberStrSplit.length;i++){
			suutiSum += Integer.parseInt(numberStrSplit[i]);	
		}
		if( Integer.parseInt(N)%suutiSum == 0){
			System.out.println("Yes");			
		}else{
			System.out.println("No");			
		}

		
		

		
		
	
	}
}
