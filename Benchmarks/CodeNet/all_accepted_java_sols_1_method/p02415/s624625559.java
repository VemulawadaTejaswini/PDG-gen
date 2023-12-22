import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        StringBuilder ret = new StringBuilder();
        
    	for (char c : line.toCharArray()) {
			if(c >= 'A' && c <= 'Z') {
				ret.append((char)(c + 32));
			} else if(c >= 'a' && c <= 'z') {
				ret.append((char)(c - 32));
			} else {
			    ret.append(c);
			}
		}

        System.out.println(ret.toString());
    }
}


