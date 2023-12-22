import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
      	sc.close();
      	int n = 0;
      	for (int i=0; i<3; i++) {
          if (s.substring(i,i+1).equals("1")) {
            n++;
          }
        }
          System.out.println(n);
	}
}