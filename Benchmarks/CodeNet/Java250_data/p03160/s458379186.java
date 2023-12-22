import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main
{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
          list.add(sc.nextInt());
        List<Integer> dyn=new ArrayList<Integer>();
        dyn.add(0);
        dyn.add((int)(Math.abs(list.get(1)-list.get(0))));
        for(int i=2;i<n;i++)
        {
             dyn.add((int)(Math.min(dyn.get(i-1)+(int)Math.abs(list.get(i)-list.get(i-1)),dyn.get(i-2)+(int)Math.abs(list.get(i)-list.get(i-2)))));
        }
        System.out.println(dyn.get(n-1));
        sc.close();
    }
}