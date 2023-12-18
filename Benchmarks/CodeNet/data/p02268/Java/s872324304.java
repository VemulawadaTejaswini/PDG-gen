
import java.util.*;

class BS
{
    public Boolean BinarySearch(int b, int [] arr)
    {
        int l = 0; int r = arr.length; Boolean hasItem = false;
        while(l<r)
        {
            int mid = (l+r)/2;
            int key = arr[mid];
            if(key==b)
            {
                hasItem=true;
                break;
            }
            else if(b<key) r = mid;
            else l = mid+1;
        }
        return hasItem;
    }
}
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a [] = new int[n];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        int q = sc.nextInt();
        BS bs = new BS();
        int cnt = 0;
        for(int i = 0; i<q; i++) 
        {
            if(bs.BinarySearch(sc.nextInt(),a))
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

