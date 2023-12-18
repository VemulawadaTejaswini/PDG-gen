import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] substr = str.split(" ", 0);

        int a = Integer.parseInt(substr[0]);
        int b = Integer.parseInt(substr[1]);

        String result = "";
        int n = 0;
        if (a >= b) {
        	result = substr[1];
        	n = a;
        } else {
        	result = substr[0];
        	n = b;
        }
    	StringBuilder buff = new StringBuilder();
        for (int i=0; i<n; i++) {
        	buff.append(result);
        }
        System.out.println(buff.toString());

        scan.close();

    }

}