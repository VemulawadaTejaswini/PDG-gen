import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int L = S.length(); 
        String[] str = S.split("");
        String str1 = "";
        String str2 = "";
        
        for(int i=0; i<(L-1)/2; i++){
            str1 += str[i];
        }
        
        for(int i=((L+3)/2)-1; i<L; i++){
            str2 += str[i];
        }  
        
        if(str1.equals(str2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
