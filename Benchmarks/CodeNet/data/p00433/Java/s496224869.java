import java.util.*;
public class Main {
    public static void main(String[] ano) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        int sum1 =scan.nextInt() + scan.nextInt() + scan.nextInt() + scan.nextInt();
        int sum2 =scan.nextInt() + scan.nextInt() +scan.nextInt() +scan.nextInt();
      System.out.println(Math.max(sum1, sum2));
}
}