import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();

		ArrayList<Integer> listA = new ArrayList<Integer>();
		for(int i = 1;i <= N;i++){
			int tmp = sc.nextInt();
			listA.add(tmp);
		}
		listA.add(X);

		ArrayList<Integer> listB = new ArrayList<Integer>();
		for(int i = 1;i <= M;i++){
			int tmp = sc.nextInt();
			listB.add(tmp);
		}
		listB.add(Y);
		
//		Collections.sort(listA);
//		Collections.sort(listB);
		int max = Collections.max(listA);
		int min = Collections.min(listB);

		//最大の数
		if(max<min){
			System.out.println("No War");
		}else{
			System.out.println("War");
		}

   		sc.close();
        return ;

    }
    
}

