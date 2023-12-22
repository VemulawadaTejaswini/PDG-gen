import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        String Ans1 = "";
        String Ans2 = "";
            for(int i = 0; i < b; i ++){
                Ans1 = Ans1 + String.valueOf(a);
            }
            for(int i = 0; i < a; i ++){
                Ans2 = Ans2 + String.valueOf(b);
            }
        int ques = Ans1.compareTo(Ans2);
        if(ques < 0) {
            System.out.println(Ans1);
        } else  {
            System.out.println(Ans2);    
        }    
        
    }
}
