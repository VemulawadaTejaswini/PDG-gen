import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int[][] building_1 = new int[3][10];
    int[][] building_2 = new int[3][10];
    int[][] building_3 = new int[3][10];
    int[][] building_4 = new int[3][10];

    int count = 0;
    while(count < n){
    String str1 = br.readLine();
    String[] str2 = str1.split(" ");
    int b = Integer.parseInt(str2[0]);
    int f = Integer.parseInt(str2[1]);
    int r = Integer.parseInt(str2[2]);
    int v = Integer.parseInt(str2[3]);

    if (b == 1){
      building_1[f - 1][r - 1] += v;
    }
    if (b == 2){
      building_2[f - 1][r - 1] += v;
    }
    if (b == 3){
      building_3[f - 1][r - 1] += v;
    }
    if (b == 4){
      building_4[f - 1][r - 1] += v;
    }
    count++;
    }

    for(int i = 0; i < 3; i++){
      for (int j = 0; j < 10; j++){
        System.out.print(" " + building_1[i][j]);
      }
      System.out.println();
    }
    System.out.println("####################");
    for(int i = 0; i < 3; i++){
      for (int j = 0; j < 10; j++){
        System.out.print(" " + building_2[i][j]);
      }
        System.out.println();
    }
    System.out.println("####################");
    for(int i = 0; i < 3; i++){
      for (int j = 0; j < 10; j++){
        System.out.print(" " + building_3[i][j]);
      }
      System.out.println();
    }
    System.out.println("####################");
    for(int i = 0; i < 3; i++){
      for (int j = 0; j < 10; j++){
        System.out.print(" " + building_4[i][j]);
      }
      System.out.println();
    }
  }
}