import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char carr[]=sc.nextLine().toCharArray();
        int n=carr.length;
        if(carr[n-1]=='s')
        System.out.println(new String(carr)+"es");
        else
        System.out.println(new String(carr)+"s");
    }
}