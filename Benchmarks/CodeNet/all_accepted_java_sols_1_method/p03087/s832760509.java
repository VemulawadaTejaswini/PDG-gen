import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] line1 = br.readLine().split(" ");
    
    int n = Integer.parseInt(line1[0]);
    int q = Integer.parseInt(line1[1]);
    int[] numAC = new int[n];
    
    char[] s = br.readLine().toCharArray();
    
    boolean a = false;
    boolean c = false;
    int sum = 0;
    for (int i=0; i<n; i++){
      c = s[i] == 'C';
      if (a && c) sum++;
      a = s[i] == 'A';
      numAC[i] = sum;
    }
    
    StringBuilder result = new StringBuilder();
    
    int l;
    int r;
    String[] question;
    for (int i=0; i<q; i++){
      question = br.readLine().split(" ");
      l = Integer.parseInt(question[0]);
      r = Integer.parseInt(question[1]);
      
      result.append(numAC[r-1]-numAC[l-1]);
      result.append("\n");
    }
    System.out.println(result);
  }
}
