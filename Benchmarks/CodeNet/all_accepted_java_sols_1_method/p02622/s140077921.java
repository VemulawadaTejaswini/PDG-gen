import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String S = s.next();
	String T = s.next();
	int count = 0;
	for(int i = 0; i < S.length(); i++){
		if(S.charAt(i) != T.charAt(i)) count++;
	}
	System.out.println(count);
    
  }
}