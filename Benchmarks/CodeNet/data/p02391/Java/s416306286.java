import java.util.Scanner;

class Main{
  public static void main(String args[]){

    Scanner scan = new Scanner(System.in);

    int a = scan.nextInt();
    int b = scan.nextInt();

    String x;
    
   if(a < b){ x =" < "; }
    else if(a > b){ x = " > ";}
    else{ x = " == ";}

    System.out.println(a);
  
}