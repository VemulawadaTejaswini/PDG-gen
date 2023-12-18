import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  String s=sc.next();
	  int max=0;
	  for(int i=0;i<s.length();i++) {
		  int count=0;
		  for(int j=i;j<s.length();j++) {
			  if(s.substring(j, j+1).equals("A")||s.substring(j, j+1).equals("C")||s.substring(j, j+1).equals("G")||s.substring(j, j+1).equals("T"))count++;
			  else break;
		  }
		  max=Math.max(max, count);
	  }
	  System.out.println(max);
  }
}
