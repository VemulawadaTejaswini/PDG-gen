import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        Double num = Double.parseDouble(str);
        Double Ans1 = Math.PI * num * num;
        Double Ans2 = 2 * Math.PI * num;
        String Ans1_str = String.format("%.5f", Ans1);
        String Ans2_str = String.format("%.5f", Ans2);
        System.out.println(Ans1_str+" "+Ans2_str);
    }
    
}