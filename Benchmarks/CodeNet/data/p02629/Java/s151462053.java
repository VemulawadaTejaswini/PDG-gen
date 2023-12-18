import java.util.Scanner;

class Main{
  public static void main(String[] args) throws Exception{
	  Scanner sc = new Scanner(System.in);
	  final long dec = sc.nextLong();
	  final int n = 26;
	  final String base36 = Long.toString(dec, n);
	  char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	  String ans = "";
	  for(int i = 0; i < base36.length(); i++) {
		  int t = Character.getNumericValue(base36.charAt(i));
		  ans += alphabet[t - 1];
	  }
	  System.out.println(ans);

  }
}