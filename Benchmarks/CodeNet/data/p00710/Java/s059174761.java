import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<Integer>();

        while(true){
            int n = sc.nextInt();
            int r = sc.nextInt();
            if(n == 0 && r == 0) break;

            ArrayList<Integer> num = new ArrayList<Integer>();
            for(int i = n; i > 0; i--){
                num.add(i);
            }

            for(int i = 0; i < r; i++){
                int p = sc.nextInt();
                int c = sc.nextInt();
                for(int j = 0; j < c; j++){
                    num.add(0, num.remove(p + c - 2));
                }
            }

            result.add(num.get(0));
        }

        for(int i : result){
            System.out.println(i);
        }

        sc.close();
    }
}
