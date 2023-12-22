import java.util.*;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){

		// 値取得
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		int cnt = 0;
		int corres[] = new int[q];
		int apps[] = new int[n];


		Arrays.fill(apps, k-q);
		while(sc.hasNext()){
			corres[cnt] = sc.nextInt();
			cnt++;
		}
		// System.out.println(corres.length);

		for(int cor:corres){
			apps[cor-1] +=1;
		}

		for(int app:apps){

			if(app <= 0){
				System.out.println("No");
			}else{
				System.out.println("Yes");
			}
		}		
	}
}
