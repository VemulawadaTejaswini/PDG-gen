import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    long[] List=new long[N];
    for(int i=0;i<N;i++) List[i]=s.nextLong();
    Arrays.sort(List);
    double d=0d;
    for(int i=0;i<N;i++) d+=Math.log10(List[i]);
    long ans=1;
    long comp=(long)Math.pow(10,18);
    
    if(d<=18){
      for(int i=0;i<N;i++) ans*=List[i];
      if(ans<=1000000000000000000L) System.out.println(ans);
      else System.out.println(-1);
    }
    else System.out.println(-1);  
  }  
}