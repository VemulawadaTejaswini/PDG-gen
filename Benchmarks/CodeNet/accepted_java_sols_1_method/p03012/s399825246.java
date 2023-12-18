import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);

    int n,i,t,min,s1,s2;
    int w[];

    n = sc.nextInt();

    w = new int[n];

    for(i=0;i<n;i++){
      w[i] = sc.nextInt();
    }
    min = 99999;
    for(t=1;t<n;t++){
      s1=0;
      s2=0;
      for(i=0;i<t;i++){
        s1 += w[i];
      }
      for(;i<n;i++){
        s2 += w[i];
      }
      if(s1>s2){
        if(min>s1-s2){
          min = s1-s2;
        }
        
      }else{
        if(min>s2-s1){
          min = s2-s1;
        }
      }

    }
    System.out.println(min);
  }
}
