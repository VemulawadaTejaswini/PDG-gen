import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long P=200003;
    int n=sc.nextInt();
    ArrayList<Long> a=new ArrayList<Long>();
    for(int i=0;i<n;i++){
      long check=sc.nextLong();
      if(check%P!=0)a.add(check%P);
    }
    Long[] al=new Long[a.size()];
    a.toArray(al);
    long sum=0;
    for(int i=0;i<al.length;i++){
      for(int j=i+1;j<al.length;j++){
        sum+=(al[i]*al[j])%P;
      }
    }
    System.out.println(sum);
  }
}