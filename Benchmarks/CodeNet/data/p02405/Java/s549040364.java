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

    int height  = 0;
    int width   = 0;
    String[] tmp = new String[2];
    for(String rectangle: rectangle_list){
      tmp = rectangle.split(" ");
      height = Integer.parseInt(tmp[0]);
      width  = Integer.parseInt(tmp[1]);
      if(width > 1){
        for(int i = 1; i <= height; i++){
          if(i % 2 == 1){
            chessboard(width, "#.");
          }else{
            chessboard(width, ".#");
          }
        }
      }else{
          System.out.print("#");
      }
      System.out.println();
    }
  }

  static void chessboard(int width, String keyword){
    int count = width / 2;
    for(int i = 0 ; i < count; i++){
      System.out.print(keyword);
    }
    System.out.println();
  }
}

