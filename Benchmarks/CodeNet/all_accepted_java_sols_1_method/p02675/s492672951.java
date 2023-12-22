import java.util.Scanner;
public class Main {
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  String num = input.next();
  String inputLast = num.substring(num.length()-1);
  //System.out.println(inputLast);
    //(inputLast.equals("3")){
    //System.out.println("bon");
    //se if()
    switch(inputLast){
      case "3":
        System.out.println("bon");
        break;
      case "0":
      case "1":
      case "6":
      case "8":
        System.out.println("pon");
        break;
      default:
        System.out.println("hon");
  }
}
}