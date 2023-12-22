import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] in = s.nextLine().split(" ");
        int a = Integer.parseInt(in[0]);
        int b = Integer.parseInt(in[1]);
        if(a <= 8 && b <= 8) {
            System.out.println("Yay!");
        }else{
            System.out.println(":(");
        }
    }
}