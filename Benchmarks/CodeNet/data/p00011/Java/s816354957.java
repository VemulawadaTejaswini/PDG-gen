import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int[] arr = new int[w+1];
    for(int i=0; i<=w; i++) {
      arr[i] = i;
    }
    int n = sc.nextInt();
    String drop = sc.nextLine();
    for(int i=0; i<n; i++) {
      String line = sc.nextLine();
      String[] tmp = line.split(",");
      int a = Integer.parseInt(tmp[0]);
      int b = Integer.parseInt(tmp[1]);
      int c = arr[a];
      arr[a] = arr[b];
      arr[b] = c;
    }
    for(int i=1; i<=w; i++) {
      System.out.println(arr[i]);
    }
  }
}