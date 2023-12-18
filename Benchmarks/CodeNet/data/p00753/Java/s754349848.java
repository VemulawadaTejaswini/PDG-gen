import java.util.ArrayList;
import java.util.Scanner;
//import java.io.File;

public class Main {
  static ArrayList<Integer> arr = new ArrayList<Integer>();
  static int calcedNumber = 2;

  public static void main(String[] args) {
  arr.add(2);

try{
    //Scanner scan = new Scanner(new File("input.txt"));
    Scanner scan = new Scanner(System.in);
    while(scan.hasNext()) {
      int input = scan.nextInt();
      if(input != 0) {
        System.out.println(calcAmount(input));
      }else {
        break;
      }
    }
    scan.close();
}catch(Exception e) {
  e.printStackTrace();
}
/*
    for(Integer i : arr) {
      System.out.print(i+",");
    }
*/
  }

  static int calcAmount(int _input) {
    if(_input*2 > calcedNumber) {
      calcMore(_input*2);
    }
    return getAmount(_input*2) - getAmount(_input);
    //return getAmount(_input);
  }

  static int getAmount(int _num) {
    //index
    int max = arr.size()-1;
    int min = 0;
    int maxNum = arr.get(max);
    int minNum = 1;

    if(maxNum < _num) return max;

    while(true) {
      int mid = (max+min)/2;
      int midNum = arr.get(mid);
      if(_num < midNum) {
        max = mid;
        maxNum = midNum;
      }else if(_num > midNum) {
        min = mid;
        minNum = midNum;
      }else {
      //  System.out.print("("+mid+")");
        return mid;
      }

      if(max-min <= 1) {
      //  System.out.print("(("+min+"))");
        return min;
      }
      //System.out.print("("+max+","+min+")");
    }
  }

  static void calcMore(int _max) {
    for(int i = calcedNumber+1; i < _max; i++) {
      boolean flag = true;
      for(Integer j : arr) {
        if(j*j > i) break;
        if(i%j == 0) flag = false;
      }
      if(flag) {
        arr.add(i);
      }
    }
    calcedNumber = _max-1;
/*
        for(Integer i : arr) {
          System.out.print(i+",");
        }
*/
  }
}