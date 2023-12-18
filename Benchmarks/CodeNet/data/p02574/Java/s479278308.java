/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author ujjwal abhishek
 */
public class Main 
{
    static int gcd(int a, int b) 
    { 
        if (a == 0) 
            return b; 
        return gcd(b % a, a); 
    } 
    static int max = (int)(1e6+1);
    static int[] spf = new int[max];
    static void solve()
    {
        spf[1] = 1;
        for(int i=2;i<max;i++)
        {
            spf[i] = i;
        }
        for(int i=4;i<max;i+=2)
        {
            spf[i] = 2;
        }
        for(int i=3;i*i<max;i++)
        {
            if(spf[i]==i)
            {
                for(int j=i*i;j<max;j+=i)
                {
                    if(spf[j]==j)
                        spf[j] = i;
                }
            }
        }
    }
    public static boolean isPairwise(int[] arr,int n)
    {
        Set<Integer> set = new HashSet<>();
        for(int x:arr)
        {
            Set<Integer> list = new HashSet<>(factors(x));
            for(int y:list)
            {
                if(set.contains(y))
                    return false;
                else
                    set.add(y);
            }
        }
        return true;
    }
    public static List<Integer> factors(int x)
    {
        List<Integer> res = new ArrayList<>();
        while(x!=1)
        {
            res.add(spf[x]);
            x/=spf[x];
        }
        return res;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++) arr[i]=sc.nextInt();
        int gcd=gcd(arr[0],arr[1]);
        for (int i=1;i<n;i++) gcd(gcd,arr[i]);
        if (gcd==1)
        {
            solve();
            if (isPairwise(arr,n))
                System.out.println("pairwise coprime");
            else
                System.out.println("setwise coprime");
        }
        else
            System.out.println("not coprime");
    }
}
