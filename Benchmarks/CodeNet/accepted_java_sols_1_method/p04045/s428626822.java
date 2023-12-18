import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> li = new ArrayList<Integer>();
        for(int i = 0; i < k; i++){
            li.add(sc.nextInt());
        }
        int ans = n;
        while(true){
            boolean bool = true;
            int tmp = ans;
            while(tmp != 0){
                int chk = tmp % 10;
                if(li.contains(chk)){
                    bool = false;
                    break;
                }
                tmp /= 10;
            }
            if(bool){
                break;
            }else{
                ans++;
            }
        }
        System.out.println(ans);
    }
}