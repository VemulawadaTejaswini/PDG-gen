import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double max=0;
        double diff=0;
        while(sc.hasNext()) {
            double mt=sc.nextDouble();
            max=Math.max(max, mt);
            diff=Math.max(diff,max-mt);
        }
        System.out.printf("%.1f",diff);
    }
}
