class Main {
  public static void main(String[] args) {
    int res = 0;
    for (int num1 = 1; num1 <= 9; num1++) {
      for (int num2 = 1; num2 <= 9; num2++) {
        res = num1 * num2;
        System.out.println(num1 + "x" + num2 +  "=" + res);
      }    
    }
  }
}