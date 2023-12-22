import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc =  new Scanner(System.in);
  int n = sc.nextInt();
  int w[] =new int[n];
    for(int count=0;count<n;count++){
      w[count]=sc.nextInt();
    }
  int min= 0;
  int min2=100;
    for(int t=1;t<=n;t++){
      int upn=0;
      int dun=0;
  for(int count=0;count<n;count++){
   if((t-1)<=count) dun+=w[count];
    else upn+=w[count];
    }min=upn-dun;
    if(min<0) min*=-1;
      if(min2>min) min2=min;
    }System.out.println(min2);
}
}