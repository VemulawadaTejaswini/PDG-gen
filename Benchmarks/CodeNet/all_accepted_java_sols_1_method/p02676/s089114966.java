import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) throws IOException {
	  Scanner in = new Scanner(System.in);
	  int k = in.nextInt();
	  in.nextLine();
	  String s = in.nextLine();
	  if(s.length()>k) {
		  s=s.substring(0,k);
		  s+="...";
	  }
	  System.out.println(s);
      
  }
}