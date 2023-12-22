import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String S = "";
        Scanner sc = new Scanner(System.in);
        S = sc.nextLine();
        String[] S1 = S.split(" ");
        System.out.println(S1[S1.length - 1]+" "+S1[0]+ " "+ S1[1]);
    }
}
