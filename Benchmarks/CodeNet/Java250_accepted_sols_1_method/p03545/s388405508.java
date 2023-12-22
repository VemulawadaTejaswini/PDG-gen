import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int line = scan.nextInt();
        int D = line % 10;
        line /= 10;
        int C = line % 10;
        line /= 10;
        int B = line % 10;
        line /= 10;
        int A = line % 10;

        if(A + B + C + D == 7) System.out.println(A+ "+" +B+ "+" +C+ "+" + D + "=7");
        else if(A - B + C + D == 7) System.out.println(A+ "-" +B+ "+" +C+ "+" + D + "=7");
        else if(A + B - C + D == 7) System.out.println(A+ "+" +B+ "-" +C+ "+" + D + "=7");
        else if(A - B - C + D == 7) System.out.println(A+ "-" +B+ "-" +C+ "+" + D + "=7");
        else if(A + B + C - D == 7) System.out.println(A+ "+" +B+ "+" +C+ "-" + D + "=7");
        else if(A - B + C - D == 7) System.out.println(A+ "-" +B+ "+" +C+ "-" + D + "=7");
        else if(A + B - C - D == 7) System.out.println(A+ "+" +B+ "-" +C+ "-" + D + "=7");
        else if(A - B - C - D == 7) System.out.println(A+ "-" +B+ "-" +C+ "-" + D + "=7");
    }
}
