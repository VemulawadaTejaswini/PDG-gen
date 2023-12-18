import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String c = sc.next();

        /*
        c = "";
        Random random = new Random();
        for(int i = 0; i < n; i++){
            c += random.nextBoolean() ? "R" :"W";
        }
        
         */

        //StringBuilder sb = new StringBuilder(c);
        //System.out.println(sb);
        int l = 0;
        int r = n - 1;
        long count = 0;
        while(l < r){
            char lc = c.charAt(l);
            char rc = c.charAt(r);
            //System.out.println(""+lc + rc);
            if(lc == 'W'){
                if(rc == 'R'){
                    count++;
                    //sb.replace(l, l + 1, "R");
                    //sb.replace(r, r + 1, "W");
                    l++;
                    r--;
                }else{
                    r--;
                }
            }else{
                if(rc == 'R'){
                    l++;
                }else{
                    l++;
                    r--;
                }
            }
        }

        System.out.println(count);
        //System.out.println(sb);

    }
}
