import java.util.Scanner;
public class Main {
	//RockPaperScissors
  public static void main( String[] args ) {
	  Scanner scan = new Scanner(System.in);
	  String S = scan.next();
	  boolean condition = true;
	  if( !(S.substring(0,1).equals("A")) ) {
		  condition = false;
		  //System.out.println("先頭の文字がAではないです。");
	  }
	  int C_cnt = 0;
	  for( int i = 2; i < S.length() - 1; i++ ) {
		  if( S.substring(i,i + 1).equals("C") )C_cnt++;
	  }
	  if( C_cnt != 1 ) {
		  condition = false;
		  //System.out.println("大文字のCの数がちょうど1ではないです。");
	  }
	  for( int i = 1; i < S.length();i++ ) {
		  if( !S.substring(i,i + 1).equals(S.substring(i,i + 1).toLowerCase()) && !(S.substring(i,i + 1).equals("C")) ) {
			  condition = false;
			  //System.out.println("AとCを除く文字列に大文字が混ざっています。 -> " + S.substring(i,i + 1) );
		  }
	  }
	  if( condition ) {
		  System.out.println("AC");
	  }else {
		  System.out.println("WA");
	  }
  }
}

