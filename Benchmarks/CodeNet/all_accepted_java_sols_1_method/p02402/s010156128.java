import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = -1000000;
        int min = 1000000;
        long sum =0;
        sc.nextLine();
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            if(a > max)max=a;
            if(a < min)min=a;
            sum+=a;
        }
        System.out.print(min +" "+ max +" "+sum);
        System.out.println();
    }
}
