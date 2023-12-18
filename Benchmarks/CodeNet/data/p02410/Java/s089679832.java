import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str1 = br.readLine();
    String[] str2 = str1.split(" ");
    int n = Integer.parseInt(str2[0]);
    int m = Integer.parseInt(str2[1]);

    int[][] A = new int[n][m];
    int[][] B = new int[1][m];
    int[][] C = new int[n][1];

    for (int i = 0; i < n; i++){
      String[] str3 = br.readLine().split(" ");
      for (int j = 0; j < m; j++){
        A[i][j] += Integer.parseInt(str3[j]);
      }
    }
    for(int i = 0; i < 1; i++){
      String[] str4 = br.readLine().split(" ");
      for(int j = 0; j < m; j++){
        B[i][j] += Integer.parseInt(str4[j]);
      }
    }
    for(int i = 0; i < n; i++){
      for(int j = 0; j < 1; j++){
        for(int k = 0; k < m; k++){
            C[i][j] = A[i][k] * B[k][j];
        }
      }
    }
    for(int i = 0; i < 1; i++){
      for(int j = 0; j < m; j++){
        System.out.println(C[i][j]);
      }
    }
  }
 }