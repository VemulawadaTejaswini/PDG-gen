import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.next());
        int cofTrain = Integer.parseInt(in.next());
        int cofTaxi = Integer.parseInt(in.next());
        in.close();
        int ans = num * cofTrain < cofTaxi ? cofTrain * num : cofTaxi;
        System.out.println(ans);
    }
}
