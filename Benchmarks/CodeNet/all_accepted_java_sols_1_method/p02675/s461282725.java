import java.util.Scanner;

public class Main{
    public static void main(String args[]){

    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    
    int v = n % 10;

    if (v == 2 || v == 4 || v== 5 || v == 7 || v == 9 ) {
        System.out.println("hon");
    } else if (v == 0 || v == 1 || v == 6 || v == 8 ) {
        System.out.println("pon");

    } else {
        System.out.println("bon");
    }

    
    



    
 

    //System.out.println();
    

    
    
        
    
      


      scan.close();
    }
  }