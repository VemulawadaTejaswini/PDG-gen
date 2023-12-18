import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        
        char[] Schar = new char[S.length()];
        char[] Tchar = new char[T.length()];
        int count = 0;
        
        
        
        for(int i=0;i<S.length();i++){
            Schar[i] = S.charAt(i);
            Tchar[i] = T.charAt(i);
            if(Schar[i]!=Tchar[i]){
                count++;
            }
        }
        
        System.out.println(count);
    }
}
