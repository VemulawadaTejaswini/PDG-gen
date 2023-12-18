import java.util.Scanner;

public class Main {
	public static void main(String[] args) {      
      Scanner sc = new Scanner(System.in);
      int[] dice = new int[6];
      for (int i=0; i<6; i++) {
        dice[i] = sc.nextInt();
      }
      int q = sc.nextInt();
      while (sc.hasNext()) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = 0;
        if (a == dice[0]) {
          if (b == dice[1]) {
            c = 3;
          } else if (b == dice[2]) {
            c = 5;
          } else if (b == dice[3]) {
            c = 2;
          } else if (b == dice[4]) {
            c = 4;
          }
        }
        if (a == dice[1]) {
          if (b == dice[0]) {
            c = 4;
          } else if (b == dice[2]) {
            c = 1;
          } else if (b == dice[3]) {
            c = 6;
          } else if (b == dice[5]) {
            c = 3;
          }
        }
        if (a == dice[2]) {
          if (b == dice[0]) {
            c = 2;
          } else if (b == dice[1]) {
            c = 6;
          } else if (b == dice[4]) {
            c = 1;
          } else if (b == dice[5]) {
            c = 5;
          }
        } 
        if (a == dice[3]) {
          if (b == dice[0]) {
            c = 5;
          } else if (b == dice[1]) {
            c = 1;
          } else if (b == dice[4]) {
            c = 6;
          } else if (b == dice[5]) {
            c = 2;
          }
        }        
        if (a == dice[4]) {
          if (b == dice[0]) {
            c = 3;
          } else if (b == dice[2]) {
            c = 6;
          } else if (b == dice[3]) {
            c = 1;
          } else if (b == dice[5]) {
            c = 4;
          }
        }        
        if (a == dice[5]) {
          if (b == dice[1]) {
            c = 4;
          } else if (b == dice[2]) {
            c = 2;
          } else if (b == dice[3]) {
            c = 5;
          } else if (b == dice[4]) {
            c = 3;
          }
        }        
        System.out.println(dice[c-1]);
      }
    }
}
