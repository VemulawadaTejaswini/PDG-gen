import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int numA = sc.nextInt();
    int numB = sc.nextInt();
    int time = sc.nextInt();
    
    long[] timeA = new long[numA];
    long[] timeB = new long[numB];
    for (int i = 0; i < numA; i++) {
      timeA[i] = sc.nextLong();
    }
    for (int j = 0; j < numB; j++) {
      timeB[j] = sc.nextLong();
    }
    
    int cntA = 0;
    int cntB = 0;
    ArrayList<Long> timeL = new ArrayList<>();
    while (cntA + cntB < numA + numB) {
      if (cntA < numA && cntB < numB) {
        if (timeA[cntA] < timeB[cntB]) {
          timeL.add(timeA[cntA]);
          cntA++;
        } else {
          timeL.add(timeB[cntB]);
          cntB++;
        }
      } else if (cntA >= numA) {
        timeL.add(timeB[cntB]);
        cntB++;
      } else {
        timeL.add(timeA[cntA]);
        cntA++;
      }
    }
    
    long totaltime = 0;
    int count = 0;
    for(long t : timeL) {
      totaltime += t;
      if (totaltime > time) {
        break;
      } else {
        count++;
      }
    }

    System.out.println(count);
  }
}