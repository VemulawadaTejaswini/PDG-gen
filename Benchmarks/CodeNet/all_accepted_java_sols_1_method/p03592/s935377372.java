import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int m = sc.nextInt();
                int k = sc.nextInt();
                boolean ebishu = true;
                for(int i = 0 ; i <= n && ebishu ; i++){
                        for(int j = 0 ; j <= m && ebishu ; j++){
                                if(i * j + (n - i) * (m - j) == k){
                                        ebishu = false;
                                }
                        }
                }
                if(ebishu){
                        System.out.println("No");
                }else{
                        System.out.println("Yes");
                }
        }
}
//変に考えずに全探索でよかった