import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int moji = s.length()-1;

        while(moji > 0){
            if(moji%2 == 0){
                String s1 = s.substring(0,moji/2-1);
                String s2 = s.substring(moji/2,moji-1);
                if(s1.equals(s2))
                    break;
            }
            moji--;
        }
        System.out.println(moji);
    }
}