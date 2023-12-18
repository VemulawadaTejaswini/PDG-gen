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
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        List<Integer> node;
        for(int i=0;i<n;i++)
          {
           node=new ArrayList<Integer>();
           for(int j=0;j<3;j++)
              node.add(sc.nextInt());
            sc.nextLine();
            list.add(node);
          }
        for(int i=1;i<n;i++)
        {
            list.get(i).set(0,list.get(i).get(0)+(int)Math.max(list.get(i-1).get(1),list.get(i-1).get(2)));
            list.get(i).set(1,list.get(i).get(1)+(int)Math.max(list.get(i-1).get(0),list.get(i-1).get(2)));
            list.get(i).set(2,list.get(i).get(2)+(int)Math.max(list.get(i-1).get(0),list.get(i-1).get(1)));
        }
        System.out.println((int)(Math.max(list.get(n-1).get(0),(int)Math.max(list.get(n-1).get(1),list.get(n-1).get(2)))));
        sc.close();
    }
}