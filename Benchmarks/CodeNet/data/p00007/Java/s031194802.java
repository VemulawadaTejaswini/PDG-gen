import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = Integer.parseInt(line);
        int kin = 100000;
        int ans;
        for(int i = 0; i < n; i++) {
            kin *= 1.05;//1.05倍
            //切り上げ
            if(kin%1000!=0) {
                kin -= kin%1000;
                kin+=1000;
            }
        }
        System.out.println(kin);
        
        
    
    }
 } 
