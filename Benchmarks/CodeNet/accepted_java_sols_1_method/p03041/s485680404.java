import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        scan.close();
        String[] str = str1.split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        StringBuffer answer = new StringBuffer();
        for (int i = 0; i < a; i++) {
            if (i == b-1){
                String temp = String.valueOf(str2.charAt(i));
                answer.append(temp.toLowerCase());
            } else {
                answer.append(str2.charAt(i));

            }
        }
        System.out.println(answer);

        }

    }
