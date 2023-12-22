import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Main {

static int mod=(int)1e9+7;
 public static void main(String[] $) {

  Scanner sc=new Scanner(System.in);
  try {
    
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++) {
      a[i]=sc.nextInt();
    }
    ArrayList<pair> al=new ArrayList<>();
    int x=1;
    int y=399;
    pair p=new pair(x,y);
    al.add(p);
    for(int i=1;i<8;i++) {
      x=y+1;
      y=y+400;
      pair pp=new pair(x,y);
      al.add(pp);
    }
  
    int count=0;
    int special=0;
    HashSet<Integer> aa=new HashSet<>();
    for(int i=0;i<n;i++) {
      if(a[i]<3200) {
        for(pair j:al) {
          if(j.x<=a[i]&&j.y>=a[i]) {
            aa.add(j.y);
          }
        }
      }else {
        special++;
      }
    }
    if(special==n) {
      System.out.println(1+" "+(aa.size()+special));
    }else
    System.out.println(aa.size()+" "+(aa.size()+special));
 
    
  }catch(Exception e) {
    return;
  }
  
}
static long pow(long x,long y) {
  long res=1l;
  while(y!=0) {
    if(y%2==1) {
      res=x*res%mod;
    }
    y/=2;
    x=x*x%mod;
  }
  return res;
}
}
class pair{
  int x,y;
  pair(int x,int y){
    this.x=x;
    this.y=y;
  }
}