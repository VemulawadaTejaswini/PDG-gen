import java.util.*;
public class Main{
    public static void main(String args[]) {
    Scanner obj = new Scanner(System.in);   
    int i;
    int n=obj.nextInt();
    String s=obj.next();
   	String str="";
   	char a[]=s.toCharArray();
    for(i=0;i<s.length();i++)
    {
        if(i==n)
        {
            str=str+"...";
            break;
        }
        else
        {
            str=str+s.charAt(i);
        }
    }
    System.out.print(str);
    
}
}