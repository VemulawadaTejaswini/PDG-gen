import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        System.out.printf("%.10f %.10f\n", r*r*Math.PI,2*r*Math.PI);

    }

}

