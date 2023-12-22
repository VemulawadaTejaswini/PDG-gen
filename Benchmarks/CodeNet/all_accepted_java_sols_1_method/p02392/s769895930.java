import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        //aとbとcの値を代入する
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        //aとbの値を比較する
        if(a < b && b < c){
            System.out.println("Yes");
        }
        
        else{
            System.out.println("No");
        }
    }
}
