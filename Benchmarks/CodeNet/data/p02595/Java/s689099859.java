import java.io.*;
class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s[] = br.readLine().trim().split(" ");
    double n = Double.parseDouble(s[0]);
    double d = Double.parseDouble(s[1]);
    int count =  0;
    while(n-- >0){
      s = br.readLine().trim().split(" ");
      double x1 = Double.parseDouble(s[0]);
      double x2 = Double.parseDouble(s[1]);
      double r = (x1*x1) + (x2*x2);
      r = Math.sqrt(r);
      if(r <= d)
        count++;
    }
    System.out.println(count);
  }
}