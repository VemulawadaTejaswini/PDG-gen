
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner=new Scanner(System.in);
        Double x1=scanner.nextDouble();
        Double y1=scanner.nextDouble();
        Double x2=scanner.nextDouble();
        Double y2=scanner.nextDouble();
        System.out.println(Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2)));
    }

}

