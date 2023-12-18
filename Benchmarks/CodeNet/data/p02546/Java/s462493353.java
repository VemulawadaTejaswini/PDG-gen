import java.util.*;

public class test{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String word;
        String neww=new String();
        word=sc.next();
        int lenth=word.length();
        if(word.charAt(lenth-1)=='s')
        {
            neww=word+"es";
        }
        else
        {
            neww=word+"s";
        }
        System.out.println(neww);
    }
}