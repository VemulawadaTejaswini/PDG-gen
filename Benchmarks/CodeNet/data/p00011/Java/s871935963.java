import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int[] v = new int[w+1];
    for(int i=0;i<=w;i++){
      v[i] = i;
    }
    int n = sc.nextInt();
    String tmp = sc.nextLine();
    for(int i=0;i<n;i++) {
      String line = sc.nextLine();
      System.out.println(line);
      String[] arr = line.split(",");
      int a = Integer.parseInt(arr[0]);
      int b = Integer.parseInt(arr[1]);
      int c = v[a];
      v[a] = v[b];
      v[b] = c;
    }
    for(int i=1;i<=w;i++) {
      System.out.println(v[i]);
    }
  }
}