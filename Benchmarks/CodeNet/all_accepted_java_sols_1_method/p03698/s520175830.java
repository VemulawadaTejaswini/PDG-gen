import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	char[] ch=sc.next().toCharArray();
    int e=0;
    for(int i=0;i<ch.length-1;i++){
      for(int j=i+1;j<ch.length;j++){
        if(ch[i]==ch[j]){
          System.out.println("no");
          e++;
          break;
        }
      }
      if(e>0){
        break;
      }
    }
    if(e==0){
      System.out.println("yes");
    }
  }
}
