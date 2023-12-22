import java.util.*;
public class Main {
    public static void main(String args[]) {
        Set<Integer> a=new TreeSet<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++)
        {
            a.add(in.nextInt());
        }
        System.out.println(a.size());
    }
}
