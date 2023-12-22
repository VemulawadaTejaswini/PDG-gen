import java.io.*;
class Main{
  public static void main(String[] args) {
    try{
      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
      int i = Integer.parseInt(br.readLine());
      for(int f=0;f<i;f++){
        String[] str = br.readLine().split("\\s");
        int a = Integer.parseInt(str[0]);
        a*=a;
        int b = Integer.parseInt(str[1]);
        b*=b;
        int c = Integer.parseInt(str[2]);
        c*=c;
        if(a+b==c||b+c==a||c+a==b) System.out.println("YES");
        else System.out.println("NO");
      }
    }catch(IOException e){}
  }
}