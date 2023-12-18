import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
    Scanner sc = new Scanner(System.in);
    
    int m;//中間テスト
    int f;//期末テスト
    int r;//再試験
    int p;//学生の合計点数、ｍ　+ｆ、ｒ
    
/*    m = sc.nextInt();
    f = sc.nextInt();
    r = sc.nextInt();
    p = m + f;
 */   
    while (sc.hasNextLine()){
        
    m = sc.nextInt();
    f = sc.nextInt();
    r = sc.nextInt();
    p = m + f;
        
        
        if( m == -1 && f ==-1 && r ==-1){
            break;
        }
        else if(p < 30 || m == -1 ||f == -1){
            System.out.println("F");
            
        }else if((30 <= p && p < 50) && 50 <= r){
             System.out.println("C");
        }
        else if(30 <= p && p < 50){
                 System.out.println("D");
        }
             else if(50 <= p && p < 65){
                 System.out.println("C");
             }else if(65 <= p && p < 80){
                 System.out.println("B");
             }else if(80 <= p){
                 System.out.println("A");
             }
    }
    }
}



