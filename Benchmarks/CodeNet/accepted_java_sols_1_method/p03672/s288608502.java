import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String u = s;
        for(int i = 0; i < s.length(); i++){
            u = s.substring(0,s.length() - i - 1);
            String copy1 = u;
            String copy2 = u;
            String copy3 = u; 
            if(u.length()%2 == 0){
                if(copy3.substring(0,(copy3.length()/2 - 1)).equals(copy1.substring(copy1.length()/2,copy1.length()-1))){
                    System.out.println(copy2.length());
                    break;
                }
            }
     }
    }
}