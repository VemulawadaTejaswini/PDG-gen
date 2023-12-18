import java.util.Scanner;

public class Main {
	    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] s = in.nextLine().split("");
        String[] cs = "CODEFESTIVAL2016".split("");
        int counter = 0;
        for (int x = 0; x < 16; x++){
        	if (s[x].equals(cs[x])){
        		continue;
        	}
        	counter++;
        }
        System.out.println(counter);
        
        in.close();
    }
}
