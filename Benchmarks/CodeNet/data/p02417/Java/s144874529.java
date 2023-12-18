import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int[] c = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r',
    's','t','u','v','w','x','y','z'};
    int[] count = new int[c.length];
    String line;
    while ((line = br.readLine()) != null){
      line = line.toLowerCase();
      char[] ch = line.toCharArray();
      for (int i = 0; i < c.length; i++){
          for (int j = 0; j < ch.length; j++){
            if (ch[j] == c[i]) {count[i]++;}
          }
      }
    }
    for (int i = 0; i < c.length; i++){
      sb.append(c[i] + ":" + count[i] + "\n");
    }
    System.out.print(sb);
    }
  }