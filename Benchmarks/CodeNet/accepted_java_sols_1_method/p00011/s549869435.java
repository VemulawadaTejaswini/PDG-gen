import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int w = sc.nextInt();
            //w是总共有几根棒棒
            int n = sc.nextInt();
            //n是换几次
            int[] values = new int[w];
            for (int i = 0; i < values.length; i++) {
                values[i] = i + 1;
                //棒棒一开始的值是1.2.3.4.5.6……
            }
            int temp = 0;
            for (int i = 0; i < n; i++) {
                String str = sc.next();
                String[] ab = str.split(",");
                int a = Integer.parseInt(ab[0]) - 1;
                temp = values[a];
                values[a] = values[Integer.parseInt(ab[1]) - 1];
                int b = Integer.parseInt(ab[1]) - 1;
                values[b] = temp;
            }
            for(int i = 0; i < w; i++){
                System.out.println(values[i]);
            }
        }
    }
}
