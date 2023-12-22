import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        long height = scanner.nextLong(); 
        long width  = scanner.nextLong();
        long field = height * width;
        long can = field / 2l;
        if (field % 2l ==1l) can++;
        if (height == 1l || width ==1l) can = 1;
        System.out.println(can);
    }
}
