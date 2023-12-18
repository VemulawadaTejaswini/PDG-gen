
import java.util.*;

public class Main {
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         for(;;){
            int n = sc.nextInt();
            if(n==0) break;
            int cnt = 0;
            int flag = -1;//フラグoff
            for(int i=0;i<n;i++){
                int k = sc.nextInt();
                if(k>0) cnt++; //景品の種類数
                if(k>=2) flag = 1; //２以上の景品があればon
            }
            if(flag<0) System.out.println("NA");
            else System.out.println(cnt+1);//景品の種類数+1で100%
        }
    }
}