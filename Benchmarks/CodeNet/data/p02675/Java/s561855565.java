import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) throws IOException {
	  Scanner in = new Scanner(System.in);
	  int n = in.nextInt();
	  int last = n % 10;
	  String res = "hon";
	  if(last==3) {
		  res = "bon";
	  }else if(last==0 || last==1 || last==6 || last==8) {
		  res = "pon";
	  }
	  System.out.println(res);
      
  }
}