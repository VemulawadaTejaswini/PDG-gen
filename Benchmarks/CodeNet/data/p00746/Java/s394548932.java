//import java.io.File;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main{
  public static void main(String[] args) {
try{

    //Scanner scan = new Scanner(new File("in.txt"));
    Scanner scan = new Scanner(System.in);

    int input1 = scan.nextInt();

    while(input1 != 0) {
      HashMap<Integer,Panel> panel = new HashMap<>();
      panel.put(0,new Panel(0,0));

      for(int i = 1; i < input1; i++) {
        int input2 = scan.nextInt();
        int input3 = scan.nextInt();

        int dx=0,dy=0;
        switch(input3) {
          case 0:
            dx=-1;
            break;
          case 1:
            dy=1;
            break;
          case 2:
            dx=1;
            break;
          case 3:
            dy=-1;
            break;
        }
        panel.put(i,new Panel(panel.get(input2).x+dx,panel.get(input2).y+dy));
      }

      //ookisakeisan
      int maxX = 0, minX = 0, maxY = 0, minY = 0;
      for(Map.Entry<Integer,Panel> entry : panel.entrySet()) {
        int nowX = entry.getValue().x;
        int nowY = entry.getValue().y;
        if(nowX > maxX) maxX = nowX;
        if(nowX < minX) minX = nowX;
        if(nowY > maxY) maxY = nowY;
        if(nowY < minY) minY = nowY;
      }

      System.out.println((maxX-minX+1)+" "+(maxY-minY+1));

      input1 = scan.nextInt();
    }

}catch(Exception e) {
  e.printStackTrace();
}
  }
}

class Panel{
  int x,y;
  Panel(int _x, int _y) {
    x = _x;
    y = _y;
  }
}