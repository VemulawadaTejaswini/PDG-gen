import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n, ans, tmp;
		while(sc.hasNext()){
			n = sc.nextInt();
			ans = 0;
			for(int i = 0; i <= 9; i++){
				for(int j = 0; j <= 9; j++){
					for(int k = 0; k <= 9; k++){
						tmp = n - (i + j + k);
						if(0 <= tmp && tmp <= 9){
							ans++;
						}
					}
				}
			}
			
			System.out.println(ans);
		}
	}
}