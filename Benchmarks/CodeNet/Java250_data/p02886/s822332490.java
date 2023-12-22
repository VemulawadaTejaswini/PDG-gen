import java.util.*;
public class Main { //クラス名はMain
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int sum2=0;
        for(int i=0;i<n;i++){
        	int d=sc.nextInt();
            sum+=d;
            sum2+=Math.pow(d,2);
        }
        int o=((int)Math.pow(sum,2)-sum2)/2;
        System.out.println(o);
    }
}