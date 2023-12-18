import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        Scanner sc = new Scanner(System.in);

        String[] array = sc.nextLine().split("[\\s]");
        sc.close();
        double x1 = Integer.parseInt(array[0]);
        double x2 = Integer.parseInt(array[1]);
        double y1 = Integer.parseInt(array[2]);
        double y2 = Integer.parseInt(array[3]);

        double n = Math.sqrt((Math.pow((y1 -x1),2)+Math.pow((y2-x2), 2)));
        System.out.println(n);
    }

}