import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        if(s.endsWith("s"))
            s+="es";
        else
            s+="s";
        System.out.println(s);
    }
}