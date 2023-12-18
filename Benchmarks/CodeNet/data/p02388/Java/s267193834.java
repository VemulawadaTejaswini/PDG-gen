class main{

public static void main (String args[]) throws IOException {
  BufferedReader br = new BufferedReader();

  String str = br.readLine(System.in);

  System.out.print(str * str * str);

}

}