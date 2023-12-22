import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  String s=sc.next();
	  int r=0,b=0;
	  for(int i=0;i<s.length();i++) {
		  if(s.substring(i, i+1).equals("0"))r++;
		  else b++;
	  }
	  System.out.println(Math.min(r, b)*2);
  }
}

