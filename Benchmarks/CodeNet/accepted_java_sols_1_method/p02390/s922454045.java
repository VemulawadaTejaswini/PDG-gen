class Main {
  public static void main(String[] args) {
    int s = new java.util.Scanner(System.in).nextInt();
    int h = s / 3600;
    int m = (s - h * 3600) / 60;
    s = s % 60;
    System.out.println(h + ":" + m + ":" + s);
  }
}
