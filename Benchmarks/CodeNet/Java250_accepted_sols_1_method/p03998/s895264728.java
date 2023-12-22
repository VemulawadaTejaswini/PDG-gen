import java.util.Scanner;
public class Main {
  public static void main( String[] args ) {
	  Scanner scan = new Scanner(System.in);
	  String S_A = scan.next();
	  String S_B = scan.next();
	  String S_C = scan.next();
	  //次が誰の手番か管理する変数（A,B,Cの3つの文字を扱う）
	  String turn = "A";
	  while( true ){
		  if( turn.equals("A") ) {	//Aさんの番の場合
			  if( S_A.length() == 0 ) {
				  System.out.println("A");
				  break;
			  }else {
				  if( S_A.substring(0, 1).equals("a") ) {
					  turn = "A";
				  }else if( S_A.substring(0, 1).equals("b") ) {
					  turn = "B";
				  }else if( S_A.substring(0, 1).equals("c") ) {
					  turn = "C";
				  }
				  S_A = S_A.substring(1, S_A.length());
			  }
		  }else if( turn.equals("B") ) {	//Bさんの番の場合
			  if( S_B.length() == 0 ) {
				  System.out.println("B");
				  break;
			  }else {
				  if( S_B.substring(0, 1).equals("a") ) {
					  turn = "A";
				  }else if( S_B.substring(0, 1).equals("b") ) {
					  turn = "B";
				  }else if( S_B.substring(0, 1).equals("c") ) {
					  turn = "C";
				  }
				  S_B = S_B.substring(1, S_B.length());
			  }
		  }else if( turn.equals("C") ) {	//Cさんの番の場合
			  if( S_C.length() == 0 ) {
				  System.out.println("C");
				  break;
			  }else {
				  if( S_C.substring(0, 1).equals("a") ) {
					  turn = "A";
				  }else if( S_C.substring(0, 1).equals("b") ) {
					  turn = "B";
				  }else if( S_C.substring(0, 1).equals("c") ) {
					  turn = "C";
				  }
				  S_C = S_C.substring(1, S_C.length());
			  }
		  }
	  }
  }
}