public class Main{
    public static void main(String[] args)

    String str = new java.util.Scanner(System.in).nextLine();
    String[] list = str.split(" ");

    String x = list[0];
    String y = list[1];

    int cm = (x + y) * 2;
    int cm2 = x * y;

    System.out.print(cm + " " cm2);
}