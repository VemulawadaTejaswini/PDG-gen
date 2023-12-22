import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String[] weather = {"Sunny", "Cloudy", "Rainy"};
    int i=0;
    if(s.equals("Sunny")) i=1;
    if(s.equals("Cloudy")) i=2;
    if(s.equals("Rainy")) i=0;
    System.out.println(weather[i]);
  }
}