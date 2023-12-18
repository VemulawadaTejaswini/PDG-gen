import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      
      String[] Weather = {"Sunny", "Cloudy", "Rainy"};
      
      for( int l_i = 0; l_i < 3; l_i++){
        if(Weather[l_i].equals(s)){
          if(l_i < 2){
          	System.out.println(Weather[l_i + 1]);
          } else {
            System.out.println(Weather[0]);
          }
        }
      }
    }
}