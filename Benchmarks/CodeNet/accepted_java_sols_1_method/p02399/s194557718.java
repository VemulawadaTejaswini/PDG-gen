import java.util.*;                                                                                  

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] l = line.split(" ");
        int a = Integer.parseInt(l[0]);
        int b = Integer.parseInt(l[1]);

        int d = a / b;
        int r = a % b;
        double f = (double)a / b;
        System.out.println(d + " " + r + " " + String.format("%f", f));
    }   
}