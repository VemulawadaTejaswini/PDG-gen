import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] setting = line.split(" ");
      	int x = Integer.parseInt(setting[0]);
        int y = Integer.parseInt(setting[1]);
        int order = Integer.parseInt(setting[2]);
      
      String[][] area = new String[x][y];
      for(int i=0;i<x;i++){
        line = sc.nextLine();
        String[] block = line.split("");
        area[i]= block;
      }
      int count =0;
      for(int i=0;i<x;i++){
        for(int j=0;j<y;j++){
          int black = 0;
          for(int a=0;a<x;a++){
            for(int b=0;b<y;b++){
              if(((i>>a)==0)&&((j>>b)==0)&&(area[a][b].equals("#"))){
                black = black+1;
              }
            }
          }
          if(black == order){
            count++;
          }
        }
      }
        System.out.println(String.valueOf(count));
    }
}