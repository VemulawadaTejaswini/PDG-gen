public class Main{
    public static void main(String[] args)

    String str = new java.util.Scanner(System.in).nextLine();
    String[] list = str.split(" ");

    String x = list[0];
    String y = list[1];

    int a = Integer.parseInt(x);
    int b = Integer.parseInt(y);

    int cm = (a + b) * 2;
    int sum = a * b;

    out.print(cm + " " sum);
}