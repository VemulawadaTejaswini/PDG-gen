import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int x = 0;
        boolean approved = true;
        
        for(int i = 0; i < n; i++) {
            x = Integer.parseInt(sc.next());
            if((x%2==0)&&(x%3 != 0)&&(x%5 != 0)) approved = false;
        }
        if(approved){
            System.out.println("APPROVED");
        }else{
            System.out.println("DENIED");
        }
    }
}