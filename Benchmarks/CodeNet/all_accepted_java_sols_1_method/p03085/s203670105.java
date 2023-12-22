import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
        switch(str){
          case "A":
            str = "T";
              break;
          case "T":
            str = "A";
              break;
          case "C":
            str = "G";
              break;
          case "G":
            str = "C";
              break;
        }
        System.out.println(str);
	}
}