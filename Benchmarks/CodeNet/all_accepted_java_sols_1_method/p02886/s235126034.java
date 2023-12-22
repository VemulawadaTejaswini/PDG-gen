import java.io.*;
class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int a[]=new int[n];
    String input = br.readLine();
    String b[]=input.split(" ");
    for(int i=0;i<a.length;i++){
      a[i]=Integer.parseInt(b[i]);
    }
    int sum=0;
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        sum = sum+(a[i]*a[j]);
      }
    }
    System.out.println(sum);
  }
}