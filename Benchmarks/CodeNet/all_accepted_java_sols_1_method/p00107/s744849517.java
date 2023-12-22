import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a==0&&b==0&&c==0) break;
            int array[] = {a, b, c};
            Arrays.sort(array);
            double num = Math.hypot(array[0], array[1])/2;
            int n=sc.nextInt();
            for(int i = 0; i < n; i++){
                 System.out.println(sc.nextInt() > num? "OK" : "NA");
            }
        }
    }
}
