import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        
        boolean fin = false;
        for(int i = 0; i <= n && !fin; i++){
            for(int j = 0; i + j <= n; j++){
                if(i*1000+j*5000+(n-i-j)*10000==y){
                    System.out.println((n-i-j) + " " + j + " " + i);
                    fin = true;
                    break;
                }
            }
        }

        if(!fin) System.out.println("-1 -1 -1");
    }
}
