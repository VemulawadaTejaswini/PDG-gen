import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    while(true) {
    String str1 = br.readLine();
    String[] str2 = str1.split(" ");
    int m = Integer.parseInt(str2[0]);
    int f = Integer.parseInt(str2[1]);
    int r = Integer.parseInt(str2[2]);
    int sum = m + f;

    if(m == -1 && f == -1 && r == -1) {break;}
    else if(m == -1 || f == -1){
      sb.append("F\n");
    }
    else if(sum >= 80){
      sb.append("A\n");
    }
    else if(sum >= 65 && sum < 80){
      sb.append("B\n");
    }
    else if(sum >= 50 && sum < 65){
      sb.append("C\n");
    }
    else if(sum >= 30 && sum < 50){
      if(r >= 50){
        sb.append("C\n");
      }
      else{
        sb.append("D\n");
      }
    }
    else if (sum < 30){
      sb.append("F\n");
    }
    }
    System.out.print(sb);
  }
}