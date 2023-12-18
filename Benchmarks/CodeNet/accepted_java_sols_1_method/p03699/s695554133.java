import java.util.*;

class Main{
  static public void main(String[] args)throws Exception{
    Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int sum=0;
   List<Integer>list=new ArrayList<>();
   for(int i=0;i<n;i++){
    list.add(sc.nextInt());
    sum+=list.get(i);
   }
   Collections.sort(list);
   for(int i=0;i<n;i++){
    if((sum%10)!=0){
        System.out.println(sum);
        return;
    }
    else{
        if((list.get(i)%10)!=0)sum-=list.get(i);
    }
   }
   System.out.println(0);
    sc.close();
  }
}
