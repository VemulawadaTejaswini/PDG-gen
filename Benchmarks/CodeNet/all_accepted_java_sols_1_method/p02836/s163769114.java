import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String data = sc.nextLine();
    String dataR = "";
    int notCount = 0;
    for (int i = data.length()-1 ; i >= 0 ; i--) {
      dataR += data.substring(i,i+1);
    }
    for (int i = 0 ; i < data.length() ; i++) {
      if (!data.substring(i,i+1).equals(dataR.substring(i,i+1))) {
        notCount++;
      }
    }
    
    System.out.println(notCount/2);
    
  }
}