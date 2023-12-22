import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = Integer.parseInt(line);

        int taro = 0;
        int hanako = 0;
        for(int i = 0; i < n; i++) {
          line = sc.nextLine();
          String[] l = line.split(" ");
          char[] t = l[0].toCharArray();
          char[] h = l[1].toCharArray();

          for(int j = 0; j < t.length; j++) {
            if(t[j] < h[j]) {
              hanako += 3;
              break;
            } else if( t[j] > h[j]) {
              taro += 3;
              break;
            } else if(j == t.length - 1 || j == h.length - 1) {
              if(t.length < h.length) {
                hanako += 3;
              } else if(t.length > h.length) {
                taro += 3;
              } else {
                hanako++;
                taro++;
              }
              break;
            }
          }
        }

        System.out.println(taro + " " + hanako);
    }
}