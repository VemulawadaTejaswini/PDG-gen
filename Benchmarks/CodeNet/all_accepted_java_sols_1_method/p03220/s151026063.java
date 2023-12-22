import java.util.*;
import static java.lang.Math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        double min = Integer.MAX_VALUE;
        int min_num = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            int h = sc.nextInt();
            if(min > min(min, abs(a-(t-h*0.006)))){
                min = min(min, abs(a-(t-h*0.006)));
                min_num = i;
            }
        }
        System.out.println(min_num+1);
    }
}