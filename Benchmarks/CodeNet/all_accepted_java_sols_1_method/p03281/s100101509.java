import java.util.Scanner;

public class Main{
  public static void main(String[] args){
  Scanner scanner=new Scanner(System.in);
  int n =scanner.nextInt();
  
  if(n<105){
  n=0;
  }else if (n<135){
  n=1;
  }else if (n<165){
  n=2;
  }else if (n<189){
  n=3;
  }else if (n<195){
  n=4;
  }else{
  n=5;
  }

  System.out.println(n);
  }
}