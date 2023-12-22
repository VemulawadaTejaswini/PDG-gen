import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int dec = 0,inc = 0;
        //マス数
        int n = sc.nextInt();
        //料金所数
        int m = sc.nextInt();
        //初期位置
        int x = sc.nextInt();

        //料金所位置
        int a = 0;
        for(int i = 0;i < m;i++){
            a = sc.nextInt();
            if(a < x){
                dec++;
            }
            else{
                inc++;
            }
        }

        System.out.println(Math.min(dec,inc));
    }
}