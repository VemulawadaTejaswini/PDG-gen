import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
		
    	int ans = 0;
    	
    	
        for(int i = 0;i <= A;i++){
           int ans1 =+ 500 * i;
                    
        	for(int j = 0;j <= B; j++){
              int  ans2 =+ 100 * j;

              for(int k = 0;k <= C;k++){
                 int ans3 =+ 50 * k;
            	if(ans1 + ans2 + ans3 == X){
                        ans++;
                }
            	}
            }
            
}

              System.out.print(ans);
    }
    }    

