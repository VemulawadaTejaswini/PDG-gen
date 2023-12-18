import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char[] c = line.toCharArray();
        int l = c.length;

        int[] n = new int[26];
        for(int i = 0; i < l; i++) {
          switch(c[i]) {
            case 'a':
            case 'A':
              n[0] += 1;
              break;
            case 'b':
            case 'B':
              n[1] += 1;
              break;
            case 'c':
            case 'C':
              n[2] += 1;
              break;
            case 'd':
            case 'D':
              n[3] += 1;
              break;
            case 'e':
            case 'E':
              n[4] += 1;
              break;
            case 'f':
            case 'F':
              n[5] += 1;
              break;
            case 'g':
            case 'G':
              n[6] += 1;
              break;
            case 'h':
            case 'H':
              n[7] += 1;
              break;
            case 'i':
            case 'I':
              n[8] += 1;
              break;
            case 'j':
            case 'J':
              n[9] += 1;
              break;
            case 'k':
            case 'K':
              n[10] += 1;
              break;
            case 'l':
            case 'L':
              n[11] += 1;
              break;
            case 'm':
            case 'M':
              n[12] += 1;
              break;
            case 'n':
            case 'N':
              n[13] += 1;
              break;
            case 'o':
            case 'O':
              n[14] += 1;
              break;
            case 'p':
            case 'P':
              n[15] += 1;
              break;
            case 'q':
            case 'Q':
              n[16] += 1;
              break;
            case 'r':
            case 'R':
              n[17] += 1;
              break;
            case 's':
            case 'S':
              n[18] += 1;
              break;
            case 't':
            case 'T':
              n[19] += 1;
              break;
            case 'u':
            case 'U':
              n[20] += 1;
              break;
            case 'v':
            case 'V':
              n[21] += 1;
              break;
            case 'w':
            case 'W':
              n[22] += 1;
              break;
            case 'x':
            case 'X':
              n[23] += 1;
              break;
            case 'y':
            case 'Y':
              n[24] += 1;
              break;
            case 'z':
            case 'Z':
              n[25] += 1;
              break;
          }
        }
        System.out.println("a : " + n[0]);
        System.out.println("b : " + n[1]);
        System.out.println("c : " + n[2]);
        System.out.println("d : " + n[3]);
        System.out.println("e : " + n[4]);
        System.out.println("f : " + n[5]);
        System.out.println("g : " + n[6]);
        System.out.println("h : " + n[7]);
        System.out.println("i : " + n[8]);
        System.out.println("j : " + n[9]);
        System.out.println("k : " + n[10]);
        System.out.println("l : " + n[11]);
        System.out.println("m : " + n[12]);
        System.out.println("n : " + n[13]);
        System.out.println("o : " + n[14]);
        System.out.println("p : " + n[15]);
        System.out.println("q : " + n[16]);
        System.out.println("r : " + n[17]);
        System.out.println("s : " + n[18]);
        System.out.println("t : " + n[19]);
        System.out.println("u : " + n[20]);
        System.out.println("v : " + n[21]);
        System.out.println("w : " + n[22]);
        System.out.println("x : " + n[23]);
        System.out.println("y : " + n[24]);
        System.out.println("z : " + n[25]);
    }
}