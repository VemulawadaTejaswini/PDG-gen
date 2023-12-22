import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
      String line = sc.nextLine();
      String str[] = line.split(" ");
      int x = Integer.parseInt(str[0]),y = Integer.parseInt(str[2]);;
      String kigo = str[1];
      System.out.println((kigo.equals("+")) ? x+y : x-y);
	}
}