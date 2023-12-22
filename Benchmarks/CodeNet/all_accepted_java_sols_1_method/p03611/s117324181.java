import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[100002];
        for(int i = 0; i < n; i++){
            int a = sc.nextInt() + 1;
            x[a]++;
            x[a-1]++;
            x[a+1]++;
        }
        Arrays.sort(x);
        System.out.print(x[100001]);
    }
}