import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int[] a=new int[s.length()];
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)=='R'){
        a[i]=i+1;
      }else{
        a[i]=i-1;
      }
    }
    int[] aa=new int[a.length];
    
    for(int i=0;i<17;i++){
      for(int j=0;j<a.length;j++){
        aa[j]=a[a[j]];
      }
      a=aa;
    }
    
    int[] b=new int[a.length];
    for(int i=0;i<a.length;i++){
      b[a[i]]++;
    }
    for(int i=0;i<a.length;i++){
      System.out.print(b[i]+" ");
    }
  }
}