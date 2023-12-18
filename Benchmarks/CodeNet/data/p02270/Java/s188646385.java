//import java.io.File;
import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Arrays;

class Main{
  static int[] things;

  public static void main(String[] args) throws Exception {
    //Scanner scan = new Scanner(new File("in.txt"));
    Scanner scan = new Scanner(System.in);

    int input1 = scan.nextInt();
    int input2 = scan.nextInt();

    things = new int[input1];
    int dummy = 0;
    for(int i = 0; i < input1; i++) {
      dummy += scan.nextInt();
      things[i] = dummy;
    }

    System.out.println(solve(input2,0,0));
  }

  static int solve(int _count, int _index, int _prevMinusNumber) {
    /*
    String space = "";
    for(int i = 0; i < _count; i++) {
      space += "   ";
    }
    */
    int minusNumber = (_index<=0)?0:things[_index-1];
      //System.out.println(space+"track="+_count+" ,index="+_index+" ,pre="+minusNumber+" ,preMinus="+_prevMinusNumber);
    if(_count <= 1) {
      //System.out.println(space+"ANSWER="+(things[things.length-1]-minusNumber));
      return things[things.length-1]-minusNumber;
    }
    int max = 1<<30;
    for(int i = _index+1; i < things.length; i++) {
      int answer1 = things[i-1]-minusNumber;
      if(answer1 > max) break;
      int answer2 = solve(_count-1,i,minusNumber);
      max = Math.min(max,Math.max(answer1,answer2));
      //System.out.println(space+"max="+max+",answer1="+answer1+",answer2="+answer2);
    }
    //System.out.println(space+"answer="+max);
    return max;
  }
}