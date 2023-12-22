import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String[] arare = new String[N];
    int counterP = 0;
    int counterW = 0;
    int counterG = 0;
    int counterY = 0;
    for(int i = 0; i < N; i++){
      String color = sc.next();
      arare[i] = color;
    }

    for(int j = 0; j < N; j++){
      if(arare[j].equals("P")){
        counterP++;
      }else if(arare[j].equals("W")){
        counterW++;
      }else if(arare[j].equals("G")){
        counterG++;
      }else if(arare[j].equals("Y")){
        counterY++;
      }
    }

    int count = 0;
    if(counterY == 0){
      System.out.println("Three");
    }else{
      System.out.println("Four");
    }

  }
}