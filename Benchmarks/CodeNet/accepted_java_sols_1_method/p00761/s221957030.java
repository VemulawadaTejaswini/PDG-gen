//import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args) {
try{
  //Scanner scan = new Scanner(new File("in.txt"));
  Scanner scan = new Scanner(System.in);

  int input1 = scan.nextInt();
  int input2 = scan.nextInt();

  while(input1!=0||input2!=0) {
    int[] arr = new int[input2];
    ArrayList<Integer> log = new ArrayList<>();
    int result = input1;
    log.add(result);

    for(int k = 0; k <= 20; k++) {
      for(int i = 0; i < input2; i++) {
        arr[i] = result % 10;
        result /= 10;
      }

/*
      //debug
      for(int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
      }
      System.out.println();
      */

      //sort
      int[] maxArr = new int[arr.length];
      int ite = 0;
      for(int i = 0; i < 10; i++) {
        for(int j = 0; j < arr.length; j++) {
          if(arr[j] == i) {
            maxArr[ite] = i;
            ite++;
          }
        }
      }
      int[] minArr = new int[arr.length];
      ite = 0;
      for(int i = 9; i >= 0; i--) {
        for(int j = 0; j < arr.length; j++) {
          if(arr[j] == i) {
            minArr[ite] = i;
            ite++;
          }
        }
      }
      //endsort

/*
            //debug
            for(int i = 0; i < maxArr.length; i++) {
              System.out.print(maxArr[i]);
            }
            System.out.println();
                  //debug
                  for(int i = 0; i < minArr.length; i++) {
                    System.out.print(minArr[i]);
                  }
                  System.out.println();
                  */

      for(int i = 0; i < arr.length; i++) {
        arr[i] = maxArr[i] - minArr[i];
        if(arr[i] < 0) arr[i+1]--;
      }

      int ten = 1;
      for(int i = 0; i < arr.length; i++) {
        result += arr[i]*ten;
        ten *= 10;
      }

      if(log.contains(result)) {
        int _index = log.indexOf(result);
        System.out.println(_index+" "+result+" "+(k-_index+1));
        break;
      }else {
        log.add(result);
        //System.out.println(" "+result);
      }
    }

    input1 = scan.nextInt();
    input2 = scan.nextInt();
  }

}catch(Exception e) {
  e.printStackTrace();
}
  }
}