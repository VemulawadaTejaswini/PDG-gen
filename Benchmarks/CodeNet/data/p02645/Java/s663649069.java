import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String a=sc.next();
        int x = a.length();
        Random random = new Random();
        int randomValue = random.nextInt(x-3);
        String b=a.substring(randomValue, randomValue+3);
        System.out.println(b);
    }
}