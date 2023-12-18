import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
   ArrayList<Integer> aa=new ArrayList<Integer>();
    for(int i=0;i<n;i++)
      aa.add(obj.nextInt());
    int q=obj.nextInt();
    for(int i=0;i<q;i++)
    {
      double sum=0;
      int aaa=obj.nextInt();
      int b=obj.nextInt();
     Collections.replaceAll(aa,aaa,b);
      sum = aa.stream()
    .mapToDouble(a -> a)
    .sum();

System.out.println((int)sum); 
    }
  }
}
      