import java.util.*; 
public class Main{
    public static void main ( String [] args) {
        // 入力値を二回入力
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt(); 

        sc.close();

        int sum = A + B;

        if (sum % 2 == 0){
            System.out.println(sum / 2);
        
        } else {
        
            System.out.println("IMPOSSIBLE");
        }


    }
}