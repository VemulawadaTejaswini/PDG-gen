import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, temp, count = 0;
        double[] a = new double[1000];

        while(true){
            n = sc.nextInt();
            if(n == 0) break;

            double ave = 0;
            ArrayList<Integer> s = new ArrayList<Integer>();

            for(int i = 0; i < n; i++){
                temp = sc.nextInt();
                s.add(temp);
                ave += s.get(i);
            }
            ave =(double) ave / n;

            for(int i = 0; i < n; i++){
                a[count] += Math.pow(s.get(i) - ave, 2);
            }
            a[count] /= n;

            a[count] = Math.sqrt(a[count]);

            count++;
        }

        for(int i = 0; i < count; i++){
            System.out.println(a[i]);
        }
        sc.close();
    }
}
