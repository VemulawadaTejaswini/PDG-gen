import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean bl = false;
        String s = sc.next();
        for(int i = 0; i < 3; i++){
            bl |= (s.charAt(i) == '7');
        }
        if(bl)System.out.println("Yes"); else System.out.println("No");
    }
}
