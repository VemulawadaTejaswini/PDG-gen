import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        String s;
        String total = "";
        int i = Integer.parseInt(n);
        s = input.nextLine();
        String[] arr = s.split(" ");
        String a1 = arr[0];
        String a2 = arr[1];
        for (int j = 0 ; j < i;j++){
            String s1 = Character.toString(a1.charAt(j));
            String s2 = Character.toString(a2.charAt(j));
            total += s1.concat(s2);
        }
        System.out.println(total);
    }
}
