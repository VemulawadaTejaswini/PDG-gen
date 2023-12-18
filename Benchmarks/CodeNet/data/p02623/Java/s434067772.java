import java.util.Scanner;

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
    long[] timeT = new long[numA + numB];
    for (int k = 0; k < (numA + numB); k++) {
      if (cntA >= numA) {
        timeT[k] = timeB[cntB];
        cntB++;
      } else if (cntB >= numB) {
        timeT[k] = timeA[cntA];
        cntA++;
      } else if (timeA[cntA] < timeB[cntB]) {
        timeT[k] = timeA[cntA];
        cntA++;
      } else {
        timeT[k] = timeB[cntB];
        cntB++;
      }
    }
    
    long totaltime = 0;
    int count = 0;
    for(long t : timeT) {
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