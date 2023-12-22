import java.util.*;

public class Main {
    public static void main(String[] args ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
		boolean flag = false;
      	int times = (B-A);
        for(int i=0;i<times+1;i++){
            if(A % K == 0){
                System.out.println("OK");
              flag = true;
                break;
            } else if(A < B){
                A++;
            }
        }
      if(!flag){
        System.out.println("NG");
      }
    }
}
