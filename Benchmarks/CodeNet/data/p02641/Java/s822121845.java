import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        if(n != 0){
            for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            list.add(a);
            }
            sc.close();
            int i = 0;
            int ans;
            while(true){
                int a = x - i;
                int b = x + i;
                if(!list.contains(a)){
                    ans = a;
                    break;
                }else if(!list.contains(b)){
                    ans = b;
                    break;
                }
                i++;
            }
            System.out.print(ans);
        }else{
            System.out.println(x);
        }
    }
}
