import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s =Integer.parseInt(sc.next());

        Map<Integer,Integer> map = new HashMap<>();
        int a = s;
        int idx = 1;
        while(a<=1000000){
            if(!map.containsKey(a)){
                map.put(a,idx);
            }else{
                System.out.println(idx);
                return;
            }
            idx++;
            if(a%2==0){
                a/=2;
            }else{
                a = 3*a+1;
            }
        }
        sc.close();
    }
}