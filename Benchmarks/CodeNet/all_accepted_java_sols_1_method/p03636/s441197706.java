import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	char[] ch=sc.next().toCharArray();
    int n=ch.length;
    System.out.println(ch[0]+String.valueOf(n-2)+ch[n-1]);
  }
}
