public class Main {
  public static void main(String[] args) {
    String weathers = args[0];
    int index = 0;
    int k = 0;
    
    while(true) {
      index = weathers.indexOf("R", index) + 1;
      if (index == 0) break;
      k++;
    }
    System.out.print(k);
  }
}