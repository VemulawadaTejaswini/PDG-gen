class Main{
 public static void main(String args[]){
  int i;
  BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
  i = Double.valueof(d.ReadLine()).doubleValue();
  i = i * i * i;
  System.out.println(i);
 }
}