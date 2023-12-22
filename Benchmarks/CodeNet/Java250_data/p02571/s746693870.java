import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String t=sc.next();
    char[] ss=new char[s.length()];
    char[] tt=new char[t.length()];
    for(int i=0;i<ss.length;i++){
      ss[i]=s.charAt(i);
    }
    for(int i=0;i<tt.length;i++){
      tt[i]=t.charAt(i);
    }
    int count;
    int min=tt.length;
    for(int i=0;i<1+ss.length-tt.length;i++){
      count=0;
      int j=i,k=0;
      while(k<tt.length){
        if(ss[j]!=tt[k]) count++;
        j++;k++;
      }
      if(min>count)min=count;
    }
    System.out.println(min);
  }
}