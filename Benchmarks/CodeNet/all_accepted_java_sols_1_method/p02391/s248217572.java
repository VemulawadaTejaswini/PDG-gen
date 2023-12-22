import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String str;
        if(a < b){
            str = "a < b";
        }else if(a == b){
            str = "a == b";
        }else{
            str = "a > b";
        }
        
        System.out.println(str);
    }
}

