import java.util.*;

public class Main {
    public static void main(String[] args){
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        StringBuilder sb = new StringBuilder(str);
        
        if(str.endsWith("s")){
            sb.append("es");
        }else{
            sb.append("s");
        }
        System.out.println(sb);
    }
}
