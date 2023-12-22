import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<Integer>();

        while(true){
            int n = sc.nextInt();
            if(n == 0) break;

            int ave = 0;
            int[] s = new int[n];
            for(int i = 0; i < n; i++){
                s[i] = sc.nextInt();
            }

            Arrays.sort(s);
            for(int i = 1; i < n - 1; i++){
                ave += s[i];
            }
            ave /= (n - 2);

            result.add(ave);
        }

        for(int i : result){
            System.out.println(i);
        }
        sc.close();
    }
}
