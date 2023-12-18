import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Long ans = 1L;

      	for(int i=0; i<num;i++){
      		ans *= sc.nextLong();
			
			 if(ans > 1000000000000000000L) {
				 ans = -1L;
				 break;
			 }
        }
		sc.close();
		System.out.println(ans);
	}
}