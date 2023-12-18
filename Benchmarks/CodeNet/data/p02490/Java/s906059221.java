import java.util.*;

public class Main {
 
    static Scanner sc = new Scanner(System.in);
     
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
 
        int num[] = new int[2];
         
        while(true){
            num[0] = sc.nextInt();
            num[1] = sc.nextInt();
             
            if(num[0] == 0 && num[1] == 0) break;
             
            Arrays.sort(num);
            System.out.println(num[0] + " " + num[1]);
        }
         
    }
 
}