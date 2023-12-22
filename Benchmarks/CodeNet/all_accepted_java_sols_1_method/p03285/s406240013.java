import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		
		int cnt = N / 4;
		int cnt_j = N / 3;
		int ans = 0;
		for(int i=0;i < cnt + 1;i++){
			for(int j=0;j < cnt_j;j++){
				ans = i * 4 + j * 7;
				if(ans == N){
			   		System.out.println("Yes");
			   		sc.close();
			   		return;
				}
			}
		}
		
   		System.out.println("No");
		
   		sc.close();
        return ;

    }
    
}

