import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i=0; i < n; i++){
            list.add(sc.nextInt());
        }

        int answer = 0;
        double ondosa = 10000;
        int index = 0;
        for(int hi: list){
            index++;
            double temp = t - hi * 0.006;
            if (Math.abs(temp - a) < ondosa){
                ondosa = Math.abs(temp - a);
                answer = index;
            }
        }

        System.out.println(answer);

    }
}
