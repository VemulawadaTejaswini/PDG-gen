import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
      	int cnt = 0;
      for(int i=A; i<=B; i++){
		if(i%K == 0){
			cnt = cnt+1;
			}
		}
        if (cnt >= 1 ) {
            System.out.println("OK");
        }
        else {
            System.out.println("NG");
        }
        scan.close();
    }
}