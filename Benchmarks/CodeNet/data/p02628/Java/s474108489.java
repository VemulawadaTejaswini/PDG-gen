import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //input
    int n = sc.nextInt();
    int k = sc.nextInt();
    ArrayList<Integer> intArray = new ArrayList<Integer>();
    for(int i = 0; i < n; i++){
      intArray.add(sc.nextInt());
    }

    //output
    //find smallest value
    int total = 0;
    for(int i = 0; i < k; i++){ //repeat k times
      int smallestInt = intArray.get(0);
      int smallestIntLocation = 0;
      for(int j = 0; j < intArray.size(); j++){
        if( intArray.get(j) < smallestInt ){
          smallestInt = intArray.get(j);
          smallestIntLocation = j;
        }
      }
      total += smallestInt;
      intArray.remove(smallestIntLocation);
    }
    System.out.println(total);

  }
}
