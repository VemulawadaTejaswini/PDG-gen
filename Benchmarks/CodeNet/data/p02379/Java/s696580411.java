import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.printf("%.8f\n",Math.sqrt(((x1 - y1) * (x1 - y1)) + ((x2 - y2) * (x2 - y2))));
    }
       
}
