import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        while(true){
            int n = sc.nextInt();
            if(n==0) break;
            int cnt = 0;
            boolean flag = false;
            for(int i=0;i<n;i++){
                int k = sc.nextInt();
                if(k>0) cnt++;
                if(k>1) flag = true;
            }
            if(!flag) System.out.println("NA");
            else System.out.println(cnt+1);
        }
    }
}