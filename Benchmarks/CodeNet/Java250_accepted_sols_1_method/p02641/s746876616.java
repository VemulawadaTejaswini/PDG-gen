import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    byte x = sc.nextByte();
    byte n = sc.nextByte();
    if(n > 0) {
      boolean[] num = new boolean[102];
      byte li = 101;
      byte ui = 0;
      for(byte i = 0; i < n; i++) {
        byte val = sc.nextByte();
        if(li > val) li = val;
        if(ui < val) ui = val;
        num[val] = true;
      }
      sc.close();
      if(li >= 1) li--;
      if(ui <= 100) ui++;
      byte cl = 0;
      byte cld = 101;
      for(byte i = li; i <= ui; i++) {
        if(!num[i]) {
          byte nd = (byte)Math.abs((int)(x - i));
          if(cld > nd) {
            cld = nd;
            cl = i;
          }
        }
      }
      System.out.println(cl); 
    } else {
      System.out.println(x);
    }
  }
}