import java.util.*;                                                                                  

public class A_B_Problem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] l = line.split(" ");
        float a = Float.parseFloat(l[0]);
        float b = Float.parseFloat(l[1]);

        int d = (int)Math.floor(a / b); 
        int r = (int)Math.floor(a % b); 
        float f = (float)a / b;
        System.out.println(d + " " + r + " " + f); 
    }   
}