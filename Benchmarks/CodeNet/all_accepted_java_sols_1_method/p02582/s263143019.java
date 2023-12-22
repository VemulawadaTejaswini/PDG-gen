import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        String s = fs.next();
        int max = 0 ;
        for(int i=0 ; i<3 ; i++){
            int cons = 0 ;
            if(s.charAt(i)=='R'){
                cons++;
                max = Math.max(max,cons);
            }else{
                continue;
            }
            for(int j=i+1; j<3 ; j++) {
                if(s.charAt(j)=='R'){
                    cons++;
                    max = Math.max(max,cons);
                }else{
                    break;
                }
            }
        }

        System.out.println(max);

    }
}
