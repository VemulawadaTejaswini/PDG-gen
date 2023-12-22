import java.util.Scanner; 
public class Main {
    
    public static void main (String [] args) {
        
        // Scannerをインスタンス化
        Scanner sc = new Scanner(System.in);
        
        // 入力値の格納
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        // 数値の計算
        int plus = A + B;
        int minus = A - B;
        int multiple = A * B;
        
        // 条件分岐
        if (plus >= minus && plus >= multiple){
           System.out.println(plus); 
        } else if (minus >= plus && minus >= multiple) {
            System.out.println(minus);
        } else{
            System.out.println(multiple);
        }
        sc.close();
    }
}