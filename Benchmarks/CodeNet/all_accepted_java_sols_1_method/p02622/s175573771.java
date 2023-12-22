import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    String S=s.next();
    String T=s.next();
	char[] Sc=S.toCharArray();
	char[] Tc=T.toCharArray();
    int ans=0;
    for(int i=0;i<Sc.length;i++) if(Sc[i]!=Tc[i]) ans+=1;
    System.out.println(ans);

  }  
}