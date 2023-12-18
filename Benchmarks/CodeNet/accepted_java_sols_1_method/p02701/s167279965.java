import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int n =ob.nextInt();
        ob.nextLine();
        HashSet<String> set = new HashSet<>();
        while(n-->0)
        set.add(ob.nextLine());
        System.out.println(set.size());

    }
}