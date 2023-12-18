import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int[] ints = {a,b,c};

        Arrays.sort(ints);

        System.out.println(ints[0]+" "+ints[1]+" "+ints[2]);
        
    }
}
