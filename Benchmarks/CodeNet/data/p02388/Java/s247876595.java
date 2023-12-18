public class Main {
  public static void main(String[] args){
    String s = System.console().readLine();
    int count = Integer.parseInt(s);
    System.out.println(count * count * count);
  }
}
