import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String str[] = new String[3];
      for (int i=0;i<3;i++){
        str[i]=scan.next();
        str[i]=str[i].substring(0,1);
      }
      System.out.println(str[0]+str[1]+str[2]);
    }
}