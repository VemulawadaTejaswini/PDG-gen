
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		try{
			while(sc.hasNextInt()){
				int a = sc.nextInt();
				int b = sc.nextInt();
				result.add(a + b);
			}
		}catch(NoSuchElementException e){
			//üÍªIíÁ½ç½à¹¸ÉðÌubNÖ
		}
		
		for(int i = 0; i < result.size(); i++){
			System.out.println(String.valueOf(result.get(i)).length());
		}
	
	}
}