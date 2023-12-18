import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //input
    int x = sc.nextInt();
    int n = sc.nextInt();
    ArrayList<Integer> intArray = new ArrayList<Integer>();
    for(int i = 0; i < n; i++){
      intArray.add(sc.nextInt());
    }

    //output
    if( n == 0 ){
      System.out.println(x);
    }else{

      for(int i = 0; i < 1000; i++){

        if( i == 0 ){
          boolean found = false;
          for(int j = 0; j < intArray.size(); j++){
            if( intArray.get(j) == x ){
              intArray.remove(j);
              found = true;
              break;
            }
          }
          if( !found ){
            System.out.println(x);
            break;
          }
        }else{
          boolean highExist = false;
          boolean lowExist = false;
          for(int j = 0; j < intArray.size(); j++){

            if( intArray.get(j) == x+i ){
              highExist = true;
              intArray.remove(j);
              j--;
            }else if( intArray.get(j) == x-i ){
              lowExist = true;
              intArray.remove(j);
              j--;
            }

            if( highExist && lowExist ){
              break;
            }

          }
          if( !(highExist && lowExist) ){
            if( highExist ){
              System.out.println(x-i);
              break;
            }else if( lowExist ){
              System.out.println(x+i);
              break;
            }else{
              System.out.println(x-i);
              break;
            }
          }
        }

      }

    }

  }
}
