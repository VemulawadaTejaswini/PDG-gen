import java.util.*;
 class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int w=0;
        int b=0;
        int a=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='.')
                w++;
        }
        a=w;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='#')
                b++;
            else
                w--;
            a=Math.min(a, (w+b));
        }
        
        System.out.println(a);
    }
}