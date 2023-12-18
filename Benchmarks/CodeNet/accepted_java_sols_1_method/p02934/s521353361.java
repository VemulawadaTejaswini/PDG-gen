import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double d = 0.0;
        int n = sc.nextInt();
        for (int i=0;i<n;i++)d+=1/sc.nextDouble();
        System.out.println(1/d);
    }
}
