
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner=new Scanner(System.in);
        Long x1= scanner.nextLong();
        Long y1= scanner.nextLong();
        Long x2= scanner.nextLong();
        Long y2= scanner.nextLong();
        System.out.println(Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2)));
    }

}

