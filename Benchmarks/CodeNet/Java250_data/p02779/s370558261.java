import java.util.HashSet;
import java.util.Scanner;

public class Main {
  	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean ans = true;

		HashSet<Integer> hs = new HashSet<>();

		for(int i=0;i<N;i++){
			int ai = sc.nextInt();

			if(hs.contains(ai)){
				ans = false;
				break;
			}

			hs.add(ai);
		}

		if(ans){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}


	}
}