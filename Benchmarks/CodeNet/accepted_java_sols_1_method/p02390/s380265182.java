import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    
	  Scanner sc = new Scanner(System.in);
	  
	  int hourS = sc.nextInt();
	  
	  int h = hourS / 3600;
	  int m = hourS % 3600 / 60;
	  int s = hourS % 60;
	  
	 
	  
	  System.out.println(h+":"+m+":"+s);
	 
	  
  }
}