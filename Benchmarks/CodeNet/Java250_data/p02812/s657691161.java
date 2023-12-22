import java.util.*;

class Main
{
    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = sc.next();
        String newS = s.replace("ABC", "0");
        
        int length = s.length() - newS.length();
        
        System.out.println(length / 2);
        
        
    }
}
        