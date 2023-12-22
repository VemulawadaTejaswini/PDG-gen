import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        int b = sc.nextInt();
        String line = sc.next();
        String[] s = line.split("");
        for(int i=0; i<num; i++){
          if(i == b-1) System.out.print(s[i].toLowerCase());
          else System.out.print(s[i]);
        }
	}
}
