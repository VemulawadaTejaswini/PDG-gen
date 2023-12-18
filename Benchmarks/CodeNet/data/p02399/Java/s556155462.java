import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    
	  Scanner sc = new Scanner(System.in);
	  
	  int a = sc.nextInt();
	  int b = sc.nextInt();
	  
	  double doublea = a;
	  double doubleb = b;
	  
	  int d = a/b;
	  int r = a%b;
	  double f = doublea / doubleb;
	  
	  System.out.println(d+" "+r+" "+f);
  }
}