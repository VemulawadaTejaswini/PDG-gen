import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n[]=new int[101];
        while(s.hasNext())n[s.nextInt()]++;
        int best=0;
        for(int e: n)if(e>best)best=e;
        for(int i=1; i<=100; i++)if(n[i]==best)System.out.println(i);
    }
}
//by Tuvhsee 12.05.2012
//Mod Value