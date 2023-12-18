import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int count = 0;
			int n = sc.nextInt();
			if(n == 0)break;
			int sum = 0;
			for(int i = 0; i <= 10000 ; i++){
				if(judge(i)){
					sum += i;
					count++;
				}
				if(count == n)break;
			}
			System.out.println(sum);
		}

	}
	static boolean judge(int x){
		if(x == 2){
			return true;
		}else if(x == 0 || x == 1){
			return false;
		}
		for(int i = 2; i < x; i++){
			if(x%i == 0)return false;
		}
		return true;
	}
}