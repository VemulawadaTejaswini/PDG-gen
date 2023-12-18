import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 入力値を受け取る
        Scanner sc = new Scanner(System.in);
        // 入力された３つの整数
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 
        String result = "";
        if( a < b && b < c ){
            result = "Yes";  
        }else{
            result = "No";
        }
        // 
        System.out.printf("%s\n",result);
        sc.close();
    }
}
