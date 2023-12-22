import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    int number=scanner.nextInt();
    int hundreds=number/100;
    int tens=number/10-hundreds*10;
    int ones=number-hundreds*100-tens*10;
    if(hundreds==7||tens==7||ones==7){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}