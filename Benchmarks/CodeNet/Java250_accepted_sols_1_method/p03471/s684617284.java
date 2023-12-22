import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long y = sc.nextLong();
        for(int i = 0; i <= 2000; i++){
            for(int j = 0; j <= 2000; j++){
                if((y - 10000*i - 5000*j)/1000 == n-i-j && n-i-j >= 0){
                    System.out.println(i + " " + j + " " + (n-i-j));
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}
