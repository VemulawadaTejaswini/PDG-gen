import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    int aa[]=new int[n];
    String s="";
    for(int i=0;i<n;i++)
    {aa[i]=obj.nextInt();
     s=s+String.valueOf(aa[i]);}
    int q=obj.nextInt();
    for(int i=0;i<q;i++)
    {
      int sum=0;
      int a=obj.nextInt();
      int b=obj.nextInt();
      //int sum=0;
      for(int j=0;j<n;j++)
      {
        if(aa[j]==a)
        {aa[j]=b;}
       
       // System.out.println(aa[j]);
      }
       for(int j=0;j<n;j++)
         sum=sum+aa[j];
     // String ss=s.replace(String.valueOf(a),String.valueOf(b));
    //   System.out.println(ss);
    //  for(int j=0;j<ss.length();j++) 
	//sum=sum+Integer.parseInt(String.valueOf(ss.charAt(j)));
     System.out.println(sum);
    }
  }
}
      