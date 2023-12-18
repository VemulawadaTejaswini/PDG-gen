import java.util.Scanner;

class Main{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   Scanner wc = new Scanner(System.in);
   int n = sc.nextInt();
   int i = wc.nextInt();
   System.out.println(n*i + " " + (2*n + 2*i));
   }
}

