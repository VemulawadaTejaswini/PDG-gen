import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        char [] aa = a.toCharArray();
        char [] bb = b.toCharArray();
        int cnt = 0;
        
        for(int i=0; i < aa.length; i++){
            if(aa[i] != bb[i]){
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}
