import java.math.BigInteger;
import java.util.Scanner;

public class Main {

  public static void main(String... args) throws Exception{
    Scanner scanner  = null;

    try{
      scanner = new Scanner(System.in);
      
      // 1行目：データセット数
      int dataSetNums = scanner.nextInt();

      // データセット単位でループする
      for(int i = 0; i < dataSetNums; i++){
        BigInteger firstNumber = scanner.nextBigInteger();
        BigInteger secondNumber = scanner.nextBigInteger();

        // BigIntegerであれば桁あふれせずに巨大な数値を扱える
        System.out.println(firstNumber.add(secondNumber).toString());
      }

    }finally{
      if(scanner != null){
        scanner.close();
      }
    }

  }
  
}