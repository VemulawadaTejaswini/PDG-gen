
import static java.lang.Integer.parseInt;

public class Main {
    public static void main (String[] args ) {
        int i,j ;
        String line = new java.util.Scanner ( System.in ).nextLine();
        String[] number = line.split(" ", 0);

        i = (int) Rectangle (parseInt(number[0]), parseInt(number[1]));
        j = (int) RectangleLength (parseInt(number[0]), parseInt(number[1]));
        System.out.println(i + " " + j);
    }
    public static double Rectangle (int x ,int y) {
        return x * y;
    }
    public static double RectangleLength (int x ,int y) {
        return (x *2) + (y * 2);
    }
}