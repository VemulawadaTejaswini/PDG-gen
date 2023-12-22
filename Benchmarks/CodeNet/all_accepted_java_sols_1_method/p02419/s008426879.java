import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

        int count = 0;
        while(true) {
            String s2 = sc.nextLine();
            if(s2.equals("END_OF_TEXT")) {
                break;
            }
            String[] ss = s2.split(" ");
            for(String s : ss) {
                String s3 = s.toLowerCase();
                if(s3.equals(s1)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
