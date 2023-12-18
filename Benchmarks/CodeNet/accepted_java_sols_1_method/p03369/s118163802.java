import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] sp = s.split("");
        int sum = 700;
		for(int i=0; i<3; i++) {
		    if(sp[i].equals("o")) sum += 100;
		}
		System.out.println(sum);
    }
}