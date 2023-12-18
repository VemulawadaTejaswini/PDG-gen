import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),k=sc.nextInt();
        System.out.println((int)(a+b+c+Math.max(a,Math.max(b,c))*(Math.pow(2,k)-1)));
        


    }
}