import java.util.Scanner;
public static boolean search(int a[], int start, int m, int q)
{
    if(m == 0)
        return true;
    else if(start >= q)
        return false;
    else
        return (search(a,start+1,m,q)||search(a,start+1,m-a[start],q));
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i++)
            num[i] = sc.nextInt();
        int q = sc.nextInt();
        int m[] = new int[q];
        for(int i = 0 ; i < q ; i++)
            m[i] = sc.nextInt();
        for(int i = 0 ; i < q ; i++)
        {
            if(search(a,0,m[i],q))
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}
