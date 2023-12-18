import java.util.Scanner;
 
public class Main {
 
    static boolean[] botai = new boolean[1000000];  //?´???°???false
    static{
        for (int i = 2; i <= 999999; i++) {
            if (botai[i])
                continue;
            for (int j = 2; i*j <= 999999; j++) {
                botai[i*j] = true;
            }
        }
    }
 
    private static int sl(int n) {
        int cou = 0;
 
        for (int i = 2; i <= n; i++) {
            if (!botai[i])
                cou++;
        }
 
        return cou;
    }
 
    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
 
        while(scan.hasNext()){
            System.out.println(sl(scan.nextInt()));
        }
    }
 
}