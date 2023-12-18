import java.util.*;

public class A_B_Problem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] l = line.split(" ");
        int a = Integer.parseInt(l[0]);
        int b = Integer.parseInt(l[1]);

        int d = (int)a / b;
        int r = (int)a % b;
        float f = (float)a / b;
        System.out.print(d + " " + r + " ");
        System.out.println(f);                                                                       
    }   
}