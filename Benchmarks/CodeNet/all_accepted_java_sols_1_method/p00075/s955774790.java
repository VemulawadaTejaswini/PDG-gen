import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
        String str = sc.nextLine();
        String  bmi[] = str.split(",");

        int output =Integer.parseInt(bmi[0]);
            double wei = Double.parseDouble(bmi[1]);
            double hei = Double.parseDouble(bmi[2]);

            if (25.0<=wei/(hei*hei)){
                System.out.println(output);
            }
        }
    }
}