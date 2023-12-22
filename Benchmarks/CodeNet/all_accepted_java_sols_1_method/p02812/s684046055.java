import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        int i=-1,cntr=0;
        while(true)
        {
            i=s.indexOf("ABC",i+1);
            if(i==-1)
            break;
            cntr++;
        }
        System.out.println(cntr);
    }
}
