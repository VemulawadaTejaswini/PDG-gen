import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
 
public class Main {    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            int p = sc.nextInt();
            list.add(p);
        }
        sc.close();
        boolean flag = true;
        int plus = x;
        int minus = x;
        while(true){
            if(flag){
                if(!list.contains(x)){
                    System.out.println(x);
                    return;
                }else{
                    flag = false;
                }
            }else{
                minus--;
                if(!list.contains(minus)){
                    System.out.println(minus);
                    return;
                }
                plus++;
                if(!list.contains(plus)){
                    System.out.println(plus);
                    return;
                }
            }
        }
    }
}