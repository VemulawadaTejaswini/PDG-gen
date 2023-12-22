import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
      	int C = sc.nextInt();
        int K = sc.nextInt();

      	int ans = 0;
      	for(int i = 0; i < K ; i++){
        	if(A != 0){
              	A--;
            	ans++;
            }else if(B != 0){
              	B--;
            }else if(C != 0){
              	C--;
            	ans--;
            }
        }
			System.out.println(ans);
		
	}
}