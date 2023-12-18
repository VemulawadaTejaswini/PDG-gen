import java.util.Scanner;

public class Main{
  public static void main(String args[]){
  Scanner scanner = new Scanner(System.in);
  int esu[];
  esu = new int[4];
    for(int i=0;i<4;i++){
        esu[i] = scanner.nextInt();   
   }
   int x = esu[1]-1;
   int y = esu[3]-1;

  System.out.println(x*y);
  }
}