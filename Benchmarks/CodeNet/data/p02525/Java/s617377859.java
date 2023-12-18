import java.util.Scanner;
public classMain {
  public static voidmain(String[] args) {
    Scanner sc= newScanner(System.in);
    while(true) {
      intn = sc.nextInt();
      if (n == 0) { break; }
      int[] scores = new int[n];
      for(inti= 0; i< scores.length; i++) {
        scores[i] = sc.nextInt();
      }

    double average = 0, variance = 0;
    int a;

    for(i=0;i<scores.length;i++){
      average+=scores[i];
    }
    average=average/n;

    for(i=0;i<scores.length;i++){
      variance+=(scores[i]-average)*(scores[i]-average);
    }
    variance=variance/n;

    printf(variance);

    System.out.println(Math.sqrt(variance));
    }
  }
}