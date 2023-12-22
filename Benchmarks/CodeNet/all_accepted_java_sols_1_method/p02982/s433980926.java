import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int D = sc.nextInt();
		
		int intArray[][] = new int[N][D];

		for(int i = 0 ;i < N;i++){
			for(int j = 0 ;j < D;j++){
				intArray[i][j] = sc.nextInt();
			}
		}

		int cnt = 0;
		for(int i = 0 ;i < N-1;i++){
			for(int i2 = i+1 ;i2 < N;i2++){
				int sum = 0;
				for(int j = 0 ;j < D;j++){
					sum += (int) Math.pow(Math.abs(intArray[i][j]-intArray[i2][j]),2);
				}
				int sumd = (int)Math.round(Math.sqrt(sum));
				if(sum == Math.pow(sumd, 2)) {
					cnt ++;
				}
//			String st = String.valueOf(sumd);
//			if(st.matches( "^(0|[-]?[1-9][0-9]*)$" )) {
//				cnt ++;
//			};
			}
		}

		System.out.println(cnt);

   		sc.close();
        return ;

    }
    
}

