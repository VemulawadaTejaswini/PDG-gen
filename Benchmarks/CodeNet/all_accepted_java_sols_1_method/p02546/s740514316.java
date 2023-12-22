import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        
        String str1 = N.substring(N.length()-1,N.length());
        
        if(str1.equals("s")){
            N = N+"es";
        }else{
            N =N+"s";
        }
        
        System.out.println(N);
    }
}
