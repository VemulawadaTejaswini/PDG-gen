import java.util.Scanner;

class Cubic
{
    public static void main(String args[])
    {
        int num = readInt();
        System.out.println(cubic(num));
    }

    private static int readInt()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int cubic(int num)
    {
        return num * num * num;
    }
}