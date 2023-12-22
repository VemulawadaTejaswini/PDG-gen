import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); 
        String a = sc.next();
        
        boolean f = false;
      in :  for(int i=0;i<s.length();i++){
            for(int j=0;j<a.length();j++){
                if(s.charAt((i+j)%s.length()) != a.charAt(j))continue in;
            }
            f=true;break;
        }
        
        System.out.println( f ? "Yes":"No");
    }
}

