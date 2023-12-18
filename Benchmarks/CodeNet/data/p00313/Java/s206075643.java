
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n > 0) {
            boolean a[] = new boolean [n + 1];
            boolean b[] = new boolean [n + 1];
            boolean c[] = new boolean [n + 1];
            
            int x = scan.nextInt();
            for(int i=0; i < x; ++i){
                int user = scan.nextInt();
                a[user] = true;
            }
            
            int y = scan.nextInt();
            for(int i=0; i < y; ++i){
                int user = scan.nextInt();
                b[user] = true;
            }

            int z = scan.nextInt();
            for(int i=0; i < z; ++i){
                int user = scan.nextInt();
                c[user] = true;
            }
            
            int answer = 0;
            
            for(int user=1; user<=n; user++){
                if( !a[user] && c[user] || b[user] && c[user]){
                    answer ++;
                }
            }
            
            System.out.println(answer);
            n = scan.nextInt();
        }
    }

}

