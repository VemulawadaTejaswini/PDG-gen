import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for(int i = a;i<=b;i++){
            int aa = i%10;
            int bb = (i%100-aa)/10;
            int cc = i%1000;
            int dd = (i%10000-cc)/1000;
            int ee = (i%100000-cc-dd)/10000;
            if(aa == ee && bb == dd){
                count++;
            }
        }
        System.out.println(count);
    }
}