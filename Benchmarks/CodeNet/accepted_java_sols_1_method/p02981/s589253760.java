import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//人数
        int a = sc.nextInt();//一人当たりの電車の値段
        int b = sc.nextInt();//全員でタクシーに乗った値段
        
        int sum = a * n;
        
        if(b>=sum){
            System.out.println(sum);
        }else{
            System.out.println(b);
        }
        
    }
}
