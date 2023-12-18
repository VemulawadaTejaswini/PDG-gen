import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String correctString = "CODEFESTIVAL2016";
        while (in.hasNextLine()) {//注意while处理多个case
        	String inCorrectString = in.nextLine();
        	int operation = 0;
        	for(int i = 0; i < 16; i++){
        		if (correctString.charAt(i)!=inCorrectString.charAt(i)) {
					++operation;
				}
        	}
        	System.out.println(operation);
        }
        in.close();
    }
}