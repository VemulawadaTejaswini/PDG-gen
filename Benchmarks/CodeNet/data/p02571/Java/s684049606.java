import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        //0回
        if(s.contains(t)){
            System.out.println(0);
          return;
        }

        char tj;
        char sj;
        int startcount = 0;
        int matchcount = 0;
        int min = 0;

        for(int i=0; i<s.length()-t.length()+1;i++){
            matchcount = 0;
            for(int j=0; j<t.length(); j++){
                tj = t.charAt(j);
                sj = s.charAt(j+startcount);
                if(tj==sj){
                    matchcount++;
                }
            }
            
            if(min==0 || min > t.length() - matchcount){
                min = t.length() - matchcount;
            }
            startcount ++;
        }
        System.out.println(min);
        sc.close();
    }
}
