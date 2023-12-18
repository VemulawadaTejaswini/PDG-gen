import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String c = sc.next();
    int answer = 0;
    int[] sumR = new int[n];
    sumR[0] = (c.charAt(0) == 'R') ? 1 : 0;
    for(int i = 1; i < n; i++){
      sumR[i] = sumR[i - 1];
      if(c.charAt(i) == 'R') sumR[i]++;
    }
    int cntR = sumR[n -1];
    int cntW = n - cntR;
    answer = Math.min(cntR, cntW);
    if(answer == 0){
      System.out.println(0);
      return;
    }
    System.out.println(Math.min(cntR - sumR[cntR - 1], answer));
  }
}
