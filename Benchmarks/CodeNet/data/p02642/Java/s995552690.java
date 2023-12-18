import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //input
    int n = sc.nextInt();
    ArrayList<Integer> intArray = new ArrayList<Integer>();
    for(int i = 0; i < n; i++){
      intArray.add(sc.nextInt());
    }

    //output
    int sum = 0;
    while( intArray.size() > 0 ){
      //find lowest number
      int lowestNum = intArray.get(0);
      int lowestNumPosition = 0;
      boolean sameNum = false;
      for(int i = 1; i < intArray.size(); i++){
        if( intArray.get(i) < lowestNum ){
          lowestNum = intArray.get(i);
          lowestNumPosition = i;
        }else if( intArray.get(i) == lowestNum ){
          sameNum = true;
        }
      }

      if( sameNum ){
        intArray.remove(lowestNumPosition);
      }else{
        intArray.remove(lowestNumPosition);
        sum++;
      }

      //remove all nums divisible by lowest num
      for(int i = 0; i < intArray.size(); i++){
        if( intArray.get(i)%lowestNum == 0 ){
          intArray.remove(i);
          i--;
        }
      }

    }
    System.out.println(sum);

  }
}
