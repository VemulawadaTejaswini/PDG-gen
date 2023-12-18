import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    HashMap<Integer,Integer> hm=new HashMap();
    while(n-->0)
    {
      int key=sc.nextInt();
      if(hm.containsKey(key))
      {
		int val=hm.get(key);
        hm.replace(key,val,val+1);
      }
      else
        hm.put(key,1);
    }
    for(Map.Entry m : hm.entrySet())
    {
      int x=(int)m.getValue();
      int y=(int)m.getKey();
      sum+=x*y;
    }
    int q=sc.nextInt();
    while(q-->0)
    {
      	int b=sc.nextInt();
      	int c=sc.nextInt();
      	int d=c-b;
      	int re=hm.get(b);
      	int	old=hm.get(c);
      	sum+=d*re;
      	hm.remove(b);
      	hm.replace(c,old,old+re);
    	System.out.println(sum);
    }
  }
}