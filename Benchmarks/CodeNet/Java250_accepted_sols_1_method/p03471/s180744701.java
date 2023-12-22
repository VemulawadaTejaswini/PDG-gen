import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
       
        int n = scan.nextInt();
        int s = scan.nextInt();

        int x = -1, y = -1, z = -1;
        boolean flg = false;
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n-i; j++){
                int k = n - (i + j);
                if((i+j+k) != n || (10000*i + 5000*j + 1000*k) != s) continue;
                else{
                    x = i;
                    y = j;
                    z = k;
                    flg = true;
                    break;
                }
            }
            if(flg) break;
        }

        System.out.println(x + " " + y + " " + z);

        scan.close();
        
    }
}