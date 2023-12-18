import java.util.*;

public class Main{
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), k=sc.nextInt(), r=sc.nextInt(),s=sc.nextInt(),p=sc.nextInt();
    String temp = sc.next();
	char[] t = temp.toCharArray();
    int ans=0;
    for(int i=0;i<n;i++){
      if(i>=k&&t[i]==t[i-k]){
        ans+=0;
        t[i]='n';
      }
	  else if(t[i]=='r')ans+=p;
      else if(t[i]=='s')ans+=r;
      else ans+=s;
    }
    System.out.println(ans);
  }
}