import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int month = sc.nextInt();
    int date = sc.nextInt();
    int month2 = sc.nextInt();
    int date2 = sc.nextInt();
    
    if(month2 == month+1){
      System.out.println(1);
    }else{
      System.out.println(0);
    }
  }
}
