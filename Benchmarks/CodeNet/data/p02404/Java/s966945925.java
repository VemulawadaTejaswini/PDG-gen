import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int h = scan.nextInt();
    int w = scan.nextInt();

    while(h != 0 || w != 0){
      StringBuilder sd = new StringBuilder();
      for (int j = 0 ;j <h;j++  ) {
          for (int i = 0;i < w ;i++ ) {
              if (i==0 || i==w-1 || j==0 || j==h-1) {
                  sd.append("#");
              }else{
                sd.append(".");
              }
          }
          sd.append("\n");
      }
      System.out.println(sd);
      h, w = scan.nextInt();
    }
  }
}