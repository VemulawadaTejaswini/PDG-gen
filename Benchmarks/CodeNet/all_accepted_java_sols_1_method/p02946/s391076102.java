import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();
        int[] num = new int[2*k-1];
        int len = num.length;
        int sum = x-k+1;


        for(int i = 0;i<len;i++){
            num[i] = sum;
            sum++;
            
        }

        for(int i = 0;i<len;i++){
            System.out.print(num[i]+" ");
        }


    }
}
