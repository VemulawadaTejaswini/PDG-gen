class Main {
  public static void main(String[] args) {
    double x = Double.parseDouble(args[0]);
    double result = Math.pow(x, 3);
    System.out.println(Double.toString(result));
  }
}