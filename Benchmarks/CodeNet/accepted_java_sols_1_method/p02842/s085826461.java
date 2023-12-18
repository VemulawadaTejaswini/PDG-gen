import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                boolean ebishu = true;
                for(int i = 1 ; i <= n ; i++){
                        if(n == Math.floor(i * 1.08)){
                                System.out.println(i);
                                ebishu = false;
                        }
                }
                if(ebishu) System.out.println(":(");
        }
}
//家庭でトラブルがありました、悲しいです