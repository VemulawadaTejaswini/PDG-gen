import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> score = new ArrayList<>();
        double total = 0;
        double a2n = 0.0;
        while(true){
        int n = sc.nextInt();
        if(n == 0){
            break;
        }
        for(int i = 0; i < n; i++){
            int s = sc.nextInt();
            score.add(s);
            total += s;
        }
        for(int i:score){
           a2n += Math.pow(i - (total/n), 2);
        }
        System.out.println(Math.sqrt(a2n/n));
        total = 0;
        a2n = 0;
        score.clear();
        }
                }
}