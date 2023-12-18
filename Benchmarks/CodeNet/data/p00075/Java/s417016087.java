import java.io.*;
class Main {
  public static void main (String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s;
    while(null != (s = in.readLine())){
      String[] arr = s.split(",",0);
      print(Long.parseLong(arr[0]),Double.parseDouble(arr[1]),Double.parseDouble(arr[2]));
    }
  }
  private static void print(long id,double  w,double h){
    double BMI = w/Math.pow(h,2);
    if(BMI >=25)
      System.out.println(id);
  }
}