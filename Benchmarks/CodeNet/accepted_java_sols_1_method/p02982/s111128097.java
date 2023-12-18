import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int[][] c = new int[a][b];
    int counter = 0;
      for(int i = 0;i < a;i++){
        for(int j = 0;j < b;j++){
          c[i][j] = sc.nextInt();
        }
      }
      for(int x = 0;x < a;x++){
        for(int v = 1;v < a-x;v++){
          int d = 0;
          double e = 0;
          int f = 0;        
          for(int y = 0;y < b;y++){ 
              d += Math.pow(c[x][y] - c[x+v][y],2);
          }      
          e = Math.sqrt(d);
          f = (int)e;
          if(e - f == 0){
            counter++;
          }
        }
      }
    System.out.println(counter);
    sc.close();
  }
}