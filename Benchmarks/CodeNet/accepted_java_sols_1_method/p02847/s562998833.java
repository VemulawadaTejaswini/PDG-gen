import java.util.Scanner;
class Main{
  public static void main(String... args){
    Scanner sc = new Scanner(System.in);
    String array[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

    String S = sc.next();
    for(int i = 0; i < array.length; i++){
      if(S.equals(array[i])){
        System.out.println(7 - i);
        break;
      }
    }
  }
}