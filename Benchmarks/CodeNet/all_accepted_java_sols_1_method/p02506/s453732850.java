import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int counter = 0;
    String keyword = sc.next();
    keyword = keyword.toLowerCase();
    while(sc.hasNext()) {
      String str = sc.next();
      str = str.toLowerCase();
      if (str.equals(keyword)) {
        counter++;
      }
    }
    System.out.println(counter);
  }
}