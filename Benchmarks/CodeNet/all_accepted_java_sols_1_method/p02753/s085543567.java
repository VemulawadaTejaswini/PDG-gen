import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        String a = s.substring(0,1);
        String b = s.substring(1,2);
        String c = s.substring(2,3);
        
        if((a.equals(b))&&(a.equals(c))){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}