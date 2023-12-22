import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k =sc.nextInt();
        int k2 =k-1;
        int sum =k;


        for(int i =0;i<n-1;i++){
            sum *=k2;
        }
        System.out.println(sum);
    }
}




