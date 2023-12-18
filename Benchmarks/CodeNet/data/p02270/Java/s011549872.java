//import java.io.File;
import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;

class Main{
  public static void main(String[] args) throws Exception {
    //Scanner scan = new Scanner(new File("in.txt"));
    Scanner scan = new Scanner(System.in);

    int input1 = scan.nextInt();
    int input2 = scan.nextInt();

    int[] things = new int[input1];
    int total = 0;
    int maxWeight = 0;
    for(int i = 0; i < input1; i++) {
      things[i] = scan.nextInt();
      total += things[i];
      maxWeight = Math.max(maxWeight,things[i]);
    }

    //System.out.println(total+","+maxWeight);

    while(true) {
      boolean flag = true;
      int weightTotal = 0;
      int track = 0;
      for(int j = 0; j < input1; ) {
        //System.out.println("track:"+track+",put:"+things[j]+",weightTotal:"+weightTotal+",maxWeight:"+maxWeight);
        if(weightTotal + things[j] > maxWeight) {
          if(track >= input2-1) {
            flag = false;
            break;
          }
          weightTotal = 0;
          track++;
          continue;
        }else {
          weightTotal += things[j];
          j++;
        }
      }
      if(flag) break;
      maxWeight++;
    }
    System.out.println(maxWeight);
  }
}