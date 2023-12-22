import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 1; i <= n; i++){
            if((int) (i * 1.08) == n){
                System.out.println(i);
                return;
            }
        }
        System.out.println(":(");
        scan.close();
    }
}
