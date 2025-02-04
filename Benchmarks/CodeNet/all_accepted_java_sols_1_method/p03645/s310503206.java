import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int start[] = new int[n+1];
        int finish[] = new int[n+1];

        for (int i=0; i < m; i++){
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            if (c1 == 1){
                start[c2] = 1;
            }
            if (c2 == n){
                finish[c1] = 1;
            }
        }
 
        boolean flg=false;
        for(int i=0; i<n; i++) {
            if (start[i] == 1) {
                if (finish[i] == 1) {
                    flg = true;
                    break;
                } 
            }
        }
        
        if(flg){
            System.out.println("POSSIBLE");
        }else{
            System.out.println("IMPOSSIBLE");
        }
 
    }
}