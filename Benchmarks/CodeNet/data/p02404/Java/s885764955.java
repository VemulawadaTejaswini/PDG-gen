import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String data;
    List<String> rectangle_list = new ArrayList<String>();
    while(true){
      data = br.readLine();
      if(data.equals("0 0")){
        break;
      }
      rectangle_list.add(data);
    }

    int height = 0;
    int width  = 0;
    String[] tmp = new String[2];
    for(String rectangle: rectangle_list){
      tmp = rectangle.split(" ");
      height = Integer.parseInt(tmp[0]);
      width  = Integer.parseInt(tmp[1]);
      frame(width);
      for(int i = 0; i < height-2; i++ ){
        System.out.print("#");
        for(int j = 0; j < width-2; j++){
          System.out.print(".");
        }
        System.out.println("#");
      }
      frame(width);
      System.out.println();
    }
  }


  static void frame(int width){
    for(int i=0; i<width; i++){
      System.out.print("#");
    }
    System.out.println();
  }
}

