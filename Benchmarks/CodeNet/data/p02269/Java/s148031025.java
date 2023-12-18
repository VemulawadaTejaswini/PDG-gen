import java.util.*;

public class Main {
  public static int h1(int key, int m) {
    return key % m;
  }
  public static int h2(int key, int m) {
    return 1 + (key % (m - 1));
  }
  public static int h(int key, int i, int m) {
    return (h1(key, m) + i * h2(key, m)) % m;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    String[] arr = new String[2];
    String[] dic = new String[n];
    int m;
    int h;
    int hash;
    for(int i = 0; i < n; i++) {
      arr = sc.nextLine().split(" ");
      int j = 0;
      if(arr[1].startsWith("A")) {
        m = 1;
      } else if(arr[1].startsWith("C")) {
        m = 2;
      } else if(arr[1].startsWith("G")) {
        m = 3;
      } else {
        m = 4;
      }
      if(arr[0].equals("insert")) {
        while(true) {
          hash = h(m, j, n);
          if(dic[hash] == null) {
            dic[hash] = arr[1];
            break;
          } else {
            j++;
          }
        }
      } else {
        while(true) {
          hash = h(m, j, n);
          if(dic[hash] == null || j >= n) {
            System.out.println("no");
            break;
          } else if(dic[hash].equals(arr[1])) {
            System.out.println("yes");
            break;
          } else {
            j++;
          }
        }
      }
    }
  }
}

