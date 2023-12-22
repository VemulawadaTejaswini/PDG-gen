import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	char[] ch=sc.next().toCharArray();
    int n=ch.length;
    for(int i=0;i<n;i+=2){
      System.out.print(ch[i]);
    }
  }
}
