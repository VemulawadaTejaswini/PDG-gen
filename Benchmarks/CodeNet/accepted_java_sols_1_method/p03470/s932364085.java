import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        /**           入力                    **/
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<Integer> aData = new HashSet<Integer>();
 
        for(int i = 0; i < n; i++){
            aData.add(scanner.nextInt());
        }
        
        //デバッグ
        //for(String aTxt : aInput) {
        //  System.out.println(aTxt);
        //}
        
        /********** ここから問題 ********/
        
        /**           出力                    **/
        System.out.println(aData.size());
    }
}