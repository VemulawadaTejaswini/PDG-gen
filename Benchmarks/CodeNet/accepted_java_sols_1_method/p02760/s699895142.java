import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int[][] a = new int[3][3];
    for(int i=0; i<3; i++) {
      String[] str = in.readLine().split(" ");
      for(int j=0; j<3; j++) {
        a[i][j] = Integer.parseInt(str[j]);
      }
    }
    
    int n = Integer.parseInt(in.readLine());
    int[] b = new int[n];
    for(int i=0; i<n; i++) {
      b[i] = Integer.parseInt(in.readLine());
      for(int j=0; j<3; j++) {
        for(int k=0; k<3; k++) {
          if(a[j][k]==b[i])
            a[j][k]=0;
        }
      }
    }
    
    boolean hantei = false;
    for(int i=0; i<3; i++){
      if(a[i][0] == a[i][1] && a[i][1] == a[i][2])
        hantei = true;
    }
    for(int i=0; i<3; i++){
      if(a[0][i] == a[1][i] && a[1][i] == a[2][i])
        hantei = true;
    }
    if(a[0][0] == a[1][1] && a[1][1] == a[2][2])
      hantei = true;
    if(a[0][2] == a[1][1] && a[1][1] == a[2][0])
      hantei = true;
    
    System.out.println(hantei==true?"Yes":"No");
  }
}