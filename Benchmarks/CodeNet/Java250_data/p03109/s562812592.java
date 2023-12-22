import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] date =  sc.next().toCharArray();
    int month = (date[5] - 48) * 10 + date[6] - 48;
    if(month >= 5){
      System.out.println("TBD");
    }else{
      System.out.println("Heisei");
    }
  }
}