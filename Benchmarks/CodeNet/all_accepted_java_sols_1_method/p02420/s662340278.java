import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int m, h;
        while(sc.hasNext()){
            String str = sc.next();
            if(str.equals("-")) break;
               m = sc.nextInt();
            for(int i = 0; i < m; i++){
                h = sc.nextInt();
                str = str.substring(h, str.length()) + str.substring(0, h);
            }
            System.out.println(str);
        }
    }
}
