import java.util.Scanner;
 
public class Main{
  public static void main(String[] args){
    Scanner stdIn=new Scanner(System.in);
    int N=stdIn.nextInt();
    int m;
    if(N<10){
      m=N;
    }
    else if(N<100){
      m=N%10;
    }
    else{
      m=N%100;
    }
    
    switch(m){
      case 0: System.out.println("hon"); break;
      case 2: System.out.println("hon"); break;
      case 4: System.out.println("hon"); break;
      case 5: System.out.println("hon"); break;
      case 7: System.out.println("hon"); break;
      case 9: System.out.println("hon"); break;
      case 1: System.out.println("pon"); break;
      case 6: System.out.println("pon"); break;
      case 8: System.out.println("pon"); break;
      case 3: System.out.println("bon"); break;
    }
  }
}