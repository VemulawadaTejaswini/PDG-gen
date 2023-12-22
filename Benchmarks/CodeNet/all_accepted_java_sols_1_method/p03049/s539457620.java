import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    String[] s=new String[n];
    int count=0,c1=0,c2=0,c3=0;
    
    for(int i=0;i<n;i++){
      s[i]=sc.next();
      int len=s[i].length();
      
      for(int j=0;j<len-1;++j){
        if(s[i].charAt(j)=='A' && s[i].charAt(j+1)=='B') count++;
      }
      if(s[i].charAt(0)=='B' && s[i].charAt(len-1)=='A') c1++;
      if(s[i].charAt(0)=='B' && s[i].charAt(len-1)!='A') c2++;
      if(s[i].charAt(0)!='B' && s[i].charAt(len-1)=='A') c3++;
    }
    if(c1==0){
      count+=Math.min(c2,c3);
    }else{
        count+=(c2+c3==0)?c1-1:c1+Math.min(c2,c3);
    }
    System.out.print(count);
  }
}
