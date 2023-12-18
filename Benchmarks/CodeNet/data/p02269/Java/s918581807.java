import java.util.HashSet;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<String>();
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++)
        {
            String str = sc.next();
            if(str.equals("insert"))
                set.add(sc.next());
            else
            {
                if(set.contains(sc.nextInt()))
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
        }
    }
}
