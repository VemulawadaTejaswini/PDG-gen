class Main{
 public static void main (String[] args) throws java.lang.Exception
 {
InputStreamReader is = new InputStreamReader(System.in);
 BufferedReader br = new BufferedReader(is);
  System.out.println("入力した値を3乗した値を出力します");
  System.out.println("数値を入力してください");
  int x = Integer.parseInt(br.readLine());
  double a = (double)x;
  double kotae = Math.pow(a,3);
  
  System.out.println(x+"を3乗した値は"+kotae+"です");
 }
}
