import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String t = in.nextLine();
        int l = s.length();
        int count = 0;
        for(int i = 0 ; i < l ; i++){
            if(s.charAt(i)!=t.charAt(i))
                count++;
        }
        System.out.println(count);
    }
}