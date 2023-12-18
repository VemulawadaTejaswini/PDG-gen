    import java.util.Scanner;
    public  class Main{
      	public static void main(String args[]){
          int A,B;
          Scanner scan = new Scanner(System.in);
          A=scan.nextInt();
          B=scan.nextInt();
          if(A==1){
          		A=14;
          }
          if( B==1){
  				B=14;
          }
          if(A < B){
            System.out.println("Bob");
          }
          if(A == B){
            	System.out.println("Draw");
           }
          if(A > B){
            	System.out.println("Alice");
          }
        }
    }
