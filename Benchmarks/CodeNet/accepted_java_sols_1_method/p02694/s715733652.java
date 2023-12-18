import java.util.Scanner;

class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long a = 100;
        long b = sc.nextLong();
        int count = 0;
        while(a<b)
        {
            a = (long)(a*1.01);
            count = count+1;
        }
        System.out.print(count);
    }
}
