import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        //aとbの値を代入する
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        //aとbの値を比較する
        if(a < b){
            System.out.println("a < b");
        }
        else if(a > b){
            System.out.println("a > b");
        }
        else{
            System.out.println("a == b");
        }

        
    }
}

