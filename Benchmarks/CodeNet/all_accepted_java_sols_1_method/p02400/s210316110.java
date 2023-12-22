import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        
        System.out.printf("%.7f %.7f",r*r*Math.PI,(r*2)*Math.PI);
    }
}
