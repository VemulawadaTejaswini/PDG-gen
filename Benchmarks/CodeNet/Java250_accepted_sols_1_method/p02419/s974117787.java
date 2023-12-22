import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String W = line.toUpperCase();

        int count = 0;
        while(!((line = sc.nextLine()).equals("END_OF_TEXT"))) {
          String[] l = line.split(" ");
          for(int i = 0; i < l.length; i++) {
            if(W.equals(l[i].toUpperCase())) {
              count++;
            }
          }
        }

        System.out.println(count);

//        String line = sc.nextLine();
//        char[] W = line.toCharArray(); //word
//
//        int count = 0;
//        while(!((line = sc.nextLine()).equals("END_OF_TEXT"))) {
//          char[] T = line.toCharArray();
//
//          for(int i = 0; i < T.length; i++) {
//            if(Character.toUpperCase(T[i]) == Character.toUpperCase(W[0]) && i + W.length - 1 < T.length) {
//              for(int j = 0; j < W.length; j++) {
//                if(Character.toUpperCase(T[i + j]) != Character.toUpperCase(W[j])) {
//                  break;
//                } else if(j == W.length - 1) {
//                  count++;
//                }
//              }
//            }
//          }
//        }
//
//        System.out.println(count);
    }
}