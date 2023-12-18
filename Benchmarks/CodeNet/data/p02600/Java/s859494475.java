import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //input
    int x = sc.nextInt();

    //output
    /*
    int value = (int)(x/100);
    if( value == 4 || value == 5 ){
      System.out.println("8");
    }else if( value == 6 || value == 7 ){
      System.out.println("7");
    }else if( value == 8 || value == 9 ){
      System.out.println("6");
    }else if( value == 10 || value == 11 ){
      System.out.println("5");
    }else if( value == 12 || value == 13 ){
      System.out.println("4");
    }else if( value == 14 || value == 15 ){
      System.out.println("3");
    }else if( value == 16 || value == 17 ){
      System.out.println("2");
    }else if( value == 18 || value == 19 ){
      System.out.println("1");
    }
    */

    int value = (int)(x/100);

    int rank = 8;
    int lowerVal = 4;
    int higherVal = 5;

    while( rank > 0 ){
      if( value == lowerVal || value == higherVal ){
        System.out.println(rank);
        break;
      }
      lowerVal += 2;
      higherVal += 2;
      rank--;
    }

  }
}
