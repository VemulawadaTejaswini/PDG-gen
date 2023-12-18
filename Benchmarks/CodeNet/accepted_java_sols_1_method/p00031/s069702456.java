import java.util.Scanner;

class Main {
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);    
    while(sc.hasNext()) {
      int n = sc.nextInt();
      String b = Integer.toBinaryString(n);
      int len = b.length();
      int i=1;
      boolean first=true;
      while(true) {
        len--;	
	if(b.substring(len, len+1).equals("1")) {
          if(first == false) {
	    System.out.print(" ");
          }
          System.out.print(i);
	  first=false;
        }
	i*=2;
	if(len == 0) {
          break;
	}
      }
      System.out.println("");
    }
  }
}