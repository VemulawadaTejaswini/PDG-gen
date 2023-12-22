import java.util.*;
 
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String before = sc.next();
        String[] data = before.split("");

        for (int i = 0; i < data.length; i++) {
            int charValue = data[i].charAt(0);
            if (charValue + num <= 90) {
                System.out.print(String.valueOf((char)(charValue + num)));
            } else {
                System.out.print(String.valueOf((char)(charValue + num - 26)));
            }
        }
        System.out.println();
	}
}
