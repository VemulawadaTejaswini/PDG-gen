import java.util.Scanner;
public class Main{
    public static boolean search(long a[], long b){
        int start = 0;
        int end = a.length-1;
        while(true){
            if(a[start] == b || a[end] == b)
                return true;
            else{
                int mid = (start + end)/2;
                if(a[mid] == b)
                    return true;
                else if(a[mid] < b)
                    start = mid;
                else
                    end = mid;
            }
            if(start + 1 >= end)
                return false;
        }
    }
    public static boolean include(long a[], long b[]){
        for(int i = 0 ; i < b.length ; i++){
            if(!(search(a,b[i])))
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        for(int i = 0 ; i < n ; i++)
            a[i] = sc.nextLong();
        int m = sc.nextInt();
        long b[] = new long[m];
        for(int i = 0 ; i < m ; i++)
            b[i] = sc.nextLong();
        if(include(a,b))
            System.out.println(1);
        else
            System.out.println(0);
    }
}
