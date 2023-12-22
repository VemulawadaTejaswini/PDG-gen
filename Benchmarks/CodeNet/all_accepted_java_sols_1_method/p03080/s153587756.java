import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),count=0;
    String s=sc.next();
    for(int i=0;i<n;i++)if(s.substring(i, i+1).equals("R"))count++;
    if(count>n/2.0) {
    	System.out.println("Yes");
    }else {
    	System.out.println("No");
    }
  }
}
