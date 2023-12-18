import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int[] t= {sc.nextInt(),sc.nextInt(),sc.nextInt()};
       Arrays.sort(t);
       System.out.println(t[0]+Math.min(sc.nextInt(), sc.nextInt())-50);
    }
}
