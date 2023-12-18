import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double x1=sc.nextDouble();
        Double y1=sc.nextDouble();
        Double x2=sc.nextDouble();
        Double y2=sc.nextDouble();
        sc.close();
        System.out.println(Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
    }
}


