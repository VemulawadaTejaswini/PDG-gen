import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str1 = br.readLine();
    String[] str2 = str1.split(" ");

    int count = 0;
    int a = Integer.parseInt(str2[0]);
    int b = Integer.parseInt(str2[1]);
    int c = Integer.parseInt(str2[2]);
    int d;
    for (int i = a; i <= b; i++){
      d = c % i;
      if (d == 0){count++;}
    }
    System.out.println(count);
  }
}