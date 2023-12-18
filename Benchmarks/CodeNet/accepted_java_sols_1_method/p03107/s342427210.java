import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int c0=0, c1 = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '0'){
                c0++;
            }else{
                c1++;
            }
        }
        
        System.out.println(Math.min(c0, c1)*2);
    }
}