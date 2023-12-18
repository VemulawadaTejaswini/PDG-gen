class Main{
 public static void main (String[] args) throws java.lang.Exception
 {
 InputStreamReader is = new InputStreamReader(System.in);
 BufferedReader br = new BufferedReader(is);
  int x = Integer.parseInt(br.readLine());
  double a = (double)x;
  double kotae = Math.pow(a,3);
  
  System.out.println((int)kotae);
 }
}
