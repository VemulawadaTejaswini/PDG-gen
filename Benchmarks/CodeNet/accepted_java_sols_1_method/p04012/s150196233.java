import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String w = sc.next();
    int c[] = new int[26];
    int f = 0;
    for(int j=0; j<26; j++) {
      c[j] = 0;
    }
    
    if(w.length() % 2 == 1) {
      System.out.println("No");
    } else {
      for(int i=0; i<w.length(); i++){
        switch(w.substring(i,i+1)) {
          case "a":
            c[0]++;
            break;
          case "b":
            c[1]++;
            break;
          case "c":
            c[2]++;
            break;
          case "d":
            c[3]++;
            break;
          case "e":
            c[4]++;
            break;
          case "f":
            c[5]++;
            break;
          case "g":
            c[6]++;
            break;
          case "h":
            c[7]++;
            break;
          case "i":
            c[8]++;
            break;
          case "j":
            c[9]++;
            break;
          case "k":
            c[10]++;
            break;
          case "l":
            c[11]++;
            break;
          case "m":
            c[12]++;
            break;
          case "n":
            c[13]++;
            break;
          case "o":
            c[14]++;
            break;
          case "p":
            c[15]++;
            break;
          case "q":
            c[16]++;
            break;
          case "r":
            c[17]++;
            break;
          case "s":
            c[18]++;
            break;
          case "t":
            c[19]++;
            break;
          case "u":
            c[20]++;
            break;
          case "v":
            c[21]++;
            break;
          case "w":
            c[22]++;
            break;
          case "x":
            c[23]++;
            break;
          case "y":
            c[24]++;
            break;
          case "z":
            c[25]++;
            break;
        }
      }
      for(int j=0; j<26; j++) {
        if(c[j] % 2 != 0) {
          f = 1;
        }
      }
      if(f==0) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}