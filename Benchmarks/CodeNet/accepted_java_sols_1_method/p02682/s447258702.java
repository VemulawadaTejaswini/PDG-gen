import java.util.*;

class Main{
public static void main(String[] args) {
  Scanner reader =new Scanner (System.in);
  int  a=reader.nextInt();
  int b=reader.nextInt();
  int c=reader.nextInt();
  int k=reader.nextInt();
  int ans=0;
  int kai=k;

  for(int i=0;i<a;i++)
  {
    if(k!=0)
    {
      k--;
      ans++;
    }else break;

  }
  for(int i=0;i<b;i++)
  {
    if(k!=0)
    {
      k--;
    }else break;
  }

    for(int i=0;i<c;i++)
    {
      if(k!=0)
      { ans--;
        k--;
      }else break;
  }
System.out.println(ans);


}

}
