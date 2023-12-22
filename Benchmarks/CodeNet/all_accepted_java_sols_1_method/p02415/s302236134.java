import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner s  = new Scanner(System.in);
        String str = s.nextLine();
        String upper  = str.toUpperCase();
        String lower = str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==upper.charAt(i)){
                System.out.print(lower.charAt(i));
            }
            else System.out.print(upper.charAt(i));
        }
        System.out.println();
    }
}
