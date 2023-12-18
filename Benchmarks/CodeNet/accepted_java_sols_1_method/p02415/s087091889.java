import java.util.Scanner; 
public class Main {
	public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
	String line = sc.nextLine();
	String answer = "";
	char b;
	int length = line.length();
	for (int i = 0; i < length; i++) {
	char ch = line.charAt(i);
    if(Character.isLowerCase(ch)==true)
    {
    	 b=Character.toUpperCase(ch);
    }
    else
    {
    	b=Character.toLowerCase(ch);
    }
	answer=answer+b;
	}
	System.out.println(answer);
	}
	}
	}
