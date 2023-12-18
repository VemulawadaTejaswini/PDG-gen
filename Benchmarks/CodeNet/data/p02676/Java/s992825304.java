import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int k =s.nextInt();
	    s.nextLine();
	    String ss = s.nextLine();
	    if(ss.length()>k) {
            String u = "";
            for (int i = 0; i < k; i++) {
                u += ss.charAt(i);
            }
            u += "...";
            System.out.println(u);
        }
	    else{
            System.out.println(ss);
        }
    }
}
