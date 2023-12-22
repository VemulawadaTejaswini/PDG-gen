import java.util.*;
class Main{
    static Scanner sr = new Scanner(System.in);

    public static void main(String[] args) throws java.lang.Exception {
        long a = sr.nextLong();
        long b = sr.nextLong();
        long c = sr.nextLong();
        long d = sr.nextLong();
        long ans[]=new long[4];
        ans[0]=a*c;
        ans[1]=a*d;
        ans[2]=b*c;
        ans[3]=b*d;
        Arrays.sort(ans);
        System.out.println(ans[3]);


        }
    }


