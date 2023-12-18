import java.util.*;

public class Main{
	public static void main(String[] arg){
    	Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int y=sc.nextInt();
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      Integer ra[]=new Integer[a];
      for(int i=0;i<a;i++)ra[i]=sc.nextInt();
      Integer ga[]=new Integer[b];
      for(int i=0;i<b;i++)ga[i]=sc.nextInt();
      Integer ca[]=new Integer[c];
      for(int i=0;i<c;i++)ca[i]=sc.nextInt();
      ArrayList<Integer> list=new ArrayList<>();
      Arrays.sort(ra,Collections.reverseOrder());Arrays.sort(ga,Collections.reverseOrder());Arrays.sort(ca,Collections.reverseOrder());
      for(int i=0;i<x;i++)list.add(ra[i]);
      for(int i=0;i<y;i++)list.add(ga[i]);
      for(int i=0;i<Math.min(c,x+y);i++)list.add(ca[i]);
      Collections.sort(list,Collections.reverseOrder());
      long ans=0;
      for(int i=0;i<y+x;i++)ans+=list.get(i);
      System.out.println(ans);
    }
}