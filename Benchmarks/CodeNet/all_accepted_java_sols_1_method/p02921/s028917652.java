import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();
        
        int Total = 0;
        
        for(int i = 0; i < 3; i++){
            char Schar = S.charAt(i);
            char Tchar = T.charAt(i);
            
            if(Schar == Tchar){
                Total++;
            }
        }
        
        System.out.println(Total);
    }
}
