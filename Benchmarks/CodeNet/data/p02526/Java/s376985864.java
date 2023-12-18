import java.util.*;
class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        HashSet<Integer> S = new HashSet<Integer>();
        int cnt=0;
        int n = scan.nextInt();
        for(int i=0; i<n; i++)
        {
            S.add(scan.nextInt());
        }
        int q = scan.nextInt();
        for(int i=0; i<q; i++)
        {
            if(S.contains(scan.nextInt()))
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}