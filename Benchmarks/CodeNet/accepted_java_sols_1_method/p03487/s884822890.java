import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Map<Integer,Integer> m=new HashMap<>();
    for(int i=0;i<n;i++){
      int a=sc.nextInt();
      m.put(a,m.getOrDefault(a,0)+1);
    }
    int sum=0;
    for(Map.Entry<Integer,Integer> e:m.entrySet()){
      if(e.getValue()>=e.getKey()){
        sum+=e.getValue()-e.getKey();;
      }else{
        sum+=e.getValue();
      }
    }
    System.out.println(sum);
  }
}