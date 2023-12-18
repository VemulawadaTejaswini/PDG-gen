import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long[] max = new long[4];
        max[0] = a * c;
        max[1] = a * d;
        max[2] = b * c;
        max[3] = b * d;

        long maxValue = max[0];
        for(int i = 0; i<max.length; i++){
            if(maxValue < max[i]){
                maxValue = max[i];
            }
        }

        System.out.println(maxValue);
    }
}