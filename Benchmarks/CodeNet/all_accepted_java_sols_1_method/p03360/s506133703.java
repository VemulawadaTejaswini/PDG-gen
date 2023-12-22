import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int[] sum = {a,b,c};

        for(int i =0;i<k;i++){
            Arrays.sort(sum);
            sum[2] *=2;
        }

        System.out.println(sum[0]+sum[1]+sum[2]);






      
    }
}
