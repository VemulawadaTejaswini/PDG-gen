import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		
		int taro = 0, hanako = 0;
		for(int i = 0; i < n; i++){
			final String fst = sc.next();
			final String snd = sc.next();
			
			if(fst.compareTo(snd) < 0){
				hanako += 3;
			}else if(fst.compareTo(snd) > 0){
				taro += 3;
			}else{
				taro++;
				hanako++;
			}
		}
		
		System.out.println(taro + " " + hanako);
		
	}
}