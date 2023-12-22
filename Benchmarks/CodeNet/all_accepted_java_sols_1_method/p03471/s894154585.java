import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int Y = sc.nextInt();
        boolean flg = true;
        for(int i = 0; i <= N; i++){
            for(int j = 0; j <= N-i; j++){
                int k = N-i-j;
                if(10000*i+5000*j+1000*k == Y){
                    System.out.print(i+" ");
                    System.out.print(j+" ");
                    System.out.println(k);
                    flg = false;
                }
            }
            if(!flg){
                break;
            }
        }
        if(flg){
            System.out.println("-1 -1 -1");
        }
    }
}