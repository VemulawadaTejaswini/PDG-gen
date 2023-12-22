import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    String s = sc.nextLine();
		    String t = sc.nextLine();
		    String[] s_s = s.split("");
		    String[] t_s = t.split("");
		    int cnt = 0;
		    for(int i=0;i<s_s.length;i++) {
		    	if(s_s[i].equals(t_s[i])) {
		    		cnt +=1;
		    	}
		    }
		    System.out.println(cnt);

		    sc.close();
	}
}
