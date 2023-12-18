import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int d = Integer.parseInt(scn.nextLine());
        String s = scn.nextLine();

        String ret = "";

        for(char c : s.toCharArray()){
            ret += (char)('A' + ((c - 'A' + d) % 26));
        }

        System.out.println(ret);


    }

}
