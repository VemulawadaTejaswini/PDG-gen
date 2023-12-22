import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N ; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int n = a[N-1];
        int m = Arrays.binarySearch(a, n / 2);
        if(m < 0){
            if(m == -N) m = N-1;
            else{
                int x = a[-m - 2];
                int y = x, i = 1;
                while(y == x && -m - 2 + i < N){
                    y = a[-m - 2 + i];
                    i++;
                }
                m = ((double)(y -  n / 2) > (double)(n / 2 - x))? x : y;
            }
        }
        else m = a[m];
        if(N == 2) m = 0;
        System.out.println(n + " " + m);
    }
}