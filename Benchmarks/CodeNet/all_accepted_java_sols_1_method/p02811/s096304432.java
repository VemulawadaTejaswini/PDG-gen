import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int x=sc.nextInt();
        if(k*500<x)
        System.out.println("No");
        else
        System.out.println("Yes");
    }
}
