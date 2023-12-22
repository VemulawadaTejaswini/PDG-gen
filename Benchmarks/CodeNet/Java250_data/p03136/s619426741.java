import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();//
		int[] l = new int[n]; 
		for(int i = 0; i < n; i++){
			l[i] = sc.nextInt();
		}

		int maxL = 0;
		int theL = -1;
		for(int i = 0; i < n; i++){
			if(maxL < l[i]){
				maxL = l[i];
				theL = i;
			}
		}

		int sum = 0;
		for(int i = 0; i < n; i++){
			if(theL != i){
				sum = sum + l[i];
			}
		}		

		String result = "No";
		if(maxL < sum) result = "Yes";

		// 出力
		System.out.println(result);
	}

}


