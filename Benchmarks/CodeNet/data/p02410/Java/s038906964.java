import java.io.*;
class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
    String str=br.readLine();
    String[] nm=str.split(" ");
    int n=Integer.parseInt(nm[0]);
    int m=Integer.parseInt(nm[1]);
    int[][] a=new int[n][m];
    int[] b=new int[m];
    int[] c=new int[n];
    for(int i=0; i<n; i++){
      String str2=br.readLine();
      String[] arr=str2.split(" ");
      for(int j=0; j<m; j++){
        a[i][j]=Integer.parseInt(arr[j]);
      }
    }
    for(int k=0; k<m; k++){
      String str3=br.readLine();
      b[k]=Integer.parseInt(str3);
    }
    for(int x=0;x<n;x++){
      for(int y=0;y<m;y++){
        int tmp= a[x][y]*b[y];
        c[x] += tmp;
      }
      System.out.println(c[x]);
    }
    br.close();
}
}