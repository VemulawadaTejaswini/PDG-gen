import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int max = (int)Math.sqrt(n);

        int[] record = new int[n+1];
        Arrays.fill(record,0);
        boolean flag = false;
        for (int x = 1;x<=max;++x)
        {
            for (int y = 1;y<=x;++y)
            {
                for (int z = 1;z<=y;++z)
                {
                    int sum = (int) Math.pow(x,2) + (int) Math.pow(y,2) + (int) Math.pow(z,2)
                            + x*y + y*z + x*z;

                    if (sum > n)
                    {
                        flag=true;
                        break;
                    }

                    //System.err.println(sum+":x="+x+", y="+y+", z="+z);
                    record[sum] = record[sum]+numOf(x,y,z);
                }
                if (flag) break;
            }
            if (flag) break;
        }

        for (int i = 1;i<=n;++i) System.out.println(record[i]);
        sc.close();
//        long end = System.currentTimeMillis();
//        System.err.println((end-start)+"ms");
    }

    public static int numOf(int x, int y, int z)
    {
        if (x==y && y==z) return 1;
        else if (x==y || y==z) return 3;
        else return 6;
    }
}