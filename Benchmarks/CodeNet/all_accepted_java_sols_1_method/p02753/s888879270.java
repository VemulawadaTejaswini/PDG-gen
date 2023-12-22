import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();
        if(S.replace("A", "").length() == 0 || S.replace("A", "").length() == 3){
            System.out.println("No");            
        }else{
            System.out.println("Yes");
        }
        
        
    }

}
