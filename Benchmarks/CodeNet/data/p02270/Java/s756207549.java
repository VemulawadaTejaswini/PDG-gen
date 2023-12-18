//import java.io.File;
import java.util.Scanner;
//import java.util.ArrayList;

import java.util.Arrays;

class Main{
  public static void main(String[] args) throws Exception {
    //Scanner scan = new Scanner(new File("in.txt"));
    Scanner scan = new Scanner(System.in);

    int input1 = scan.nextInt();
    int input2 = scan.nextInt();

    int max = 0;
    int[] arr = new int[input2];
    int[] thing = new int[input1];
/*
    ArrayList<ArrayList<Integer>> debug = new ArrayList<ArrayList<Integer>>();
    for(int i = 0; i < input2; i++) {
      debug.add(new ArrayList<Integer>());
    }
    */

    for(int i = 0; i < input1; i++) {
      thing[i] = scan.nextInt();
    }

    for(int i = 0; i < input1; i++) {
      for(int j = i+1; j < input1; j++) {
        if(thing[i] < thing[j]) {
          int dummy = thing[i];
          thing[i] = thing[j];
          thing[j] = dummy;
        }
      }
    }

    for(int input3 : thing) {
      int min = 1 << 30;
      int minIndex = 0;
      for(int j = 0; j < input2; j++) {
        if(arr[j] < min) {
          minIndex = j;
          min = arr[j];
        }
      }
      arr[minIndex] += input3;
      //debug.get(minIndex).add(input3);
      if(max < arr[minIndex]) max = arr[minIndex];
    }

    //System.out.println(debug.toString());
    //System.out.println(Arrays.toString(arr));
    System.out.println(max);
  }
}