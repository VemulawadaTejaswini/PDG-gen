import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	char[] ch=sc.next().toCharArray();
    String s="";
    for(int i=0;i<ch.length;i++){
      if(ch[i]=='?'){
        ch[i]='D';
      }
      s+=ch[i];
    }
    System.out.println(s);
  }
}
