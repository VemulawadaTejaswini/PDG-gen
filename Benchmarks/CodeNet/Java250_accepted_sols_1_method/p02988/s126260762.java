import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		
		int intArray[] = new int[N];

		for(int i = 0 ;i < N;i++){
			intArray[i] = sc.nextInt();
		}

		int cnt = 0;
		for(int i = 0 ;i < N-2;i++){
			if(intArray[i]<intArray[i+1]) {
				if(intArray[i+1]<intArray[i+2]) {
					cnt ++;
				}
				
			}else {
				if(intArray[i]>intArray[i+1]) {
					if(intArray[i+1]>intArray[i+2]) {
						cnt ++;
					}
				}
			}
		}

		System.out.println(cnt);

   		sc.close();
        return ;

    }
    
}

