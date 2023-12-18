import java.util.*;
 
public class Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        //文字列を1文字ずつに分解し、配列の各要素へ格納
        String[] array = line.split(" ");
        String S = array[0]+array[1];
        int num = Integer.parseInt(S);
        int ans = (int)Math.sqrt(num);
        int han = ans * ans;
        
        if(han == num){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}