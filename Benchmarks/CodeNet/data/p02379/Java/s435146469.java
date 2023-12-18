import java.util.*;                                                                                  

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] l = line.split(" ");
        int x1 = Integer.parseInt(l[0]);
        int y1 = Integer.parseInt(l[1]);
        int x2 = Integer.parseInt(l[2]);
        int y2 = Integer.parseInt(l[3]);

        int x = x1 - x2; 
        int y = y1 - y2; 

        double z = (double)Math.pow(x, 2) + Math.pow(y, 2); 
        double z2 = (double)Math.sqrt(z);

        System.out.println(z2);
    }   
}