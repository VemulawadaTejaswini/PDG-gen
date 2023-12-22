
import java.util.Scanner;




public class Main{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    String S = sc.next();

    String[] splitArray = S.split("");

    int flg = 0;



    for (int i = 0; i < splitArray.length - 1; i ++ ) {

      if (splitArray[i].equals(splitArray[i+1])) {

        System.out.println("Bad");

        System.exit(0);

      }

    }


    

    System.out.println("Good");



  }


}




