import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
        String S = sc.next();
        if(S.equals("-")) break;
        int m = sc.nextInt();
        for(int i = 0; i<m; i++){
            int h = sc.nextInt();
            String primer = S.substring(0,h);
            String follower = S.substring(h);
            
            S = new String(follower+primer);
        }
        System.out.println(S);
        }
        sc.close();
    }
}
