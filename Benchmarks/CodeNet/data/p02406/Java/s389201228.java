import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      
      int x1,x2,x3;
      
      for(int i = 1; i <= n; i++){
          x1 = i / 10;
          x2 = i / 100;
          x3 = i / 1000;
     
        if(i % 3 == 0 || i % 10 == 3 || x1 % 10 == 3 || x2 % 10 == 3 || x3 % 10 == 3){
        	
          System.out.print( " " + i );
          
        }
      }
	System.out.println();
  }
}