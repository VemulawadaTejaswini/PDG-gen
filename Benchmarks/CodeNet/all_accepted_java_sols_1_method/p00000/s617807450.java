public class Main
{
    public static void main(String... args)
    {
        for (int left = 1; left <= 9; left++) {
            for (int right = 1; right <= 9; right++) {
                System.out.println(String.format("%dx%d=%d", left, right, left * right));
            }
        }
    }
}