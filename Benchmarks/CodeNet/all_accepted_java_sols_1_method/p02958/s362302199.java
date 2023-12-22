import java.math.BigDecimal;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String pStr = sc.nextLine();

        int[] p = new int[n];
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(pStr.split(" ")[i]);
            temp[i]  = Integer.parseInt(pStr.split(" ")[i]);
        }

        Arrays.sort(temp);

        boolean sorted = true;
        int before, after;
        before = after  = 0;
        for(int i = 0;i < n; i++){
            if(p[i] != temp[i]){
                sorted  = false;
                before = i;
                break;
            }
        }
        if(sorted){
            System.out.println("YES");
            return;
        }



        for(int i = n - 1; i >= 0; i--){
            if(p[i] != temp[i]){
                after = i;
                break;
            }
        }

        if(p[before] == temp[after] && p[after] == temp[before]){
            int t;
            t = p[after];
            p[after] = p[before];
            p[before] = t;
        }

        sorted = true;
        for(int i = 0;i < n; i++){
            if(p[i] != temp[i]){
                sorted  = false;
                break;
            }
        }
        if(sorted){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }


}
