import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        calc(a,b);
        in.close();
    }
    
    public static void calc(int a,int b){
        int dev = a / b;
        int surplus = a % b;
        double devB = ((double)a / (double)b);
        System.out.printf("%d %d %f%n",dev,surplus,devB);
    }
}
