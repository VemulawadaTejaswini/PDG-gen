import java.util.Scanner;
import java.util.Arrays;

class Main {
  boolean[] primeTable;
  public static void main(String[] args) {
    Scanner cin = new Scanner(System.in);
    PrimeNum prime = new PrimeNum(100000010);
    prime.createTable();
    int n = cin.nextInt(), ct = 0;
    for (int i = 0; i < n; i++){
      int num = cin.nextInt();
      if (prime.judge(num)) ct++;
    }
    System.out.println(ct);
  }
}

class PrimeNum {
  private boolean[] primeTable;
  private int maxNum;
  
  PrimeNum(int n) {
    primeTable = new boolean[n];
    Arrays.fill(primeTable, true);
    this.maxNum = n;
  }

  protected void createTable() {
    final double sqrt_max = Math.sqrt(maxNum);
    for (int i = 2; i < sqrt_max; i++){
      if (primeTable[i]){
        for (int j = i * 2; j < maxNum; j += i)
          primeTable[j] = false;
      }
    }
  }

  protected boolean judge(int n) {
    return (primeTable[n]);
  }

  protected int serch(int n) {
    for (int i = 2; i < maxNum; i++){
      if (primeTable[i]) n--;
      if (n == 0) return(i);
    }
    return (-1);
  }
}