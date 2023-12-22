import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 300; i++) {
          String line = sc.nextLine();
          String[] l = line.split(" ");
          int H = Integer.parseInt(l[0]);
          int W = Integer.parseInt(l[1]);
          if(H == 0 && W == 0) {
            break;
          }

          int flag;
          for(int h = 0; h < H; h++) {
            if(h % 2 == 0) {
              flag = 0;
            } else {
              flag = 1;
            }

            for(int w = 0; w < W; w++) {
              if(flag == 0) {
                System.out.print("#");
                flag = 1;
              } else {
                System.out.print(".");
                flag = 0;
              }
            }

            System.out.println();
          }

          System.out.println();
        }
    }
}