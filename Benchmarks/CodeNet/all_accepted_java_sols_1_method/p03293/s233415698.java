import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String s1 = scan.next();
        String s2 = scan.next();
        if(s1.length() != s2.length()){
            System.out.println("No");
            return;
        }
        int i , j;
        for(i = 0; i < s1.length(); i++){
            for(j = 0; j < s1.length(); j++){
                if(s1.charAt((i+j)%s1.length())==s2.charAt(j))
                    continue;
                break;
            }
            if(j == s1.length()){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
