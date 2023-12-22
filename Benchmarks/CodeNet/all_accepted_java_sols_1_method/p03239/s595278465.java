import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int cost = 0;

        for(int i = 0; i < n; i++){
            int tempcost = sc.nextInt();
            int temptime = sc.nextInt();
            if(t >= temptime){
                if(cost > tempcost || cost == 0) {
                    cost = tempcost;
                }
            }
        }

        if(cost == 0){
            System.out.println("TLE");
        }
        else {
            System.out.println(cost);
        }
    }
}
