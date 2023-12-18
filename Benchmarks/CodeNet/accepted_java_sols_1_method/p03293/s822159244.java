import java.util.*;
public class Main{
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        String s1= sc.next();
        String s2= sc.next();
        br:
        for(int i=0;i<s2.length();i++){
            for(int j=0;j<s1.length();j++){
                if(s1.charAt(j) != s2.charAt((i+j)%s2.length())){
                    continue br;
                }
            }
            System.out.println("Yes");
            return ;
        }
        System.out.println("No");
            return ;
    }
}
