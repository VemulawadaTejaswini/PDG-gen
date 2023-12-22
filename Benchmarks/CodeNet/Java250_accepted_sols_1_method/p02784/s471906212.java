import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int enemyH = sc.nextInt();
        int t = sc.nextInt();
        int total = 0;
        for(int i = 0;i < t;i++){
            total += sc.nextInt();
        }
        if(enemyH <= total){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
