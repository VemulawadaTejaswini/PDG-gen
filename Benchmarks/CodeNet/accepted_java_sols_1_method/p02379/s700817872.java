import java.util.*;                                                                                  

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] l = line.split(" ");
        double x1 = Double.parseDouble(l[0]);
        double y1 = Double.parseDouble(l[1]);
        double x2 = Double.parseDouble(l[2]);
        double y2 = Double.parseDouble(l[3]);

        double x = (double)x1 - x2; 
        double y = (double)y1 - y2; 

        double z = (double)Math.pow(x, 2) + Math.pow(y, 2); 
        double z2 = (double)Math.sqrt(z);

        System.out.println(z2);
    }   
}