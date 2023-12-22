import java.util.Scanner;

 class Rectangle {
     private static int a;
     private static int b;

     static void run () {
        readInput();
        printCubic();
    }
     private static void readInput() {
        Scanner sc = new Scanner(System.in);
         a =sc.nextInt();
         b =sc.nextInt();
    }
     private static void printCubic (){
        System.out.println((a * b) + " " + ((a + b) * 2));
    }
}
public class Main {
    public static void main(String[] args) {
        Rectangle.run();
    }
}