import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    while(true){
    String str1 = br.readLine();
    String[] str2 = str1.split(" ");
    int n = Integer.parseInt(str2[0]);
    int x = Integer.parseInt(str2[1]);
    int count = 0;
    if (n == 0 && x == 0) {break;}
    for (int i = 1; i <= n; i++){
      for (int j = i + 1; j <= n; j++){
        for (int k = j + 1; k <= n; k++){
          if (i == j || j == k || k == i){break;}
          else if (i + j + k == x){count++;}
        }
      }
    }
    System.out.println(count);
  }

  }
}