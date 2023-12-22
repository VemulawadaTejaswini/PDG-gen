import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        
        int start =0;
        int end =0;
        boolean j1 = false;
        
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i) == 'A' && j1 == false){
                start = i;
                j1 = true;
            }
            
            else if(S.charAt(i) == 'Z'){
                end = i;
            }
        }
        
        int answer = end - start +1;
        
        System.out.println(answer);
        
    }
}
