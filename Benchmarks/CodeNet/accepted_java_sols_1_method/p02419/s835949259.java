import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String W = scan.nextLine();
        int count = 0;
        String T;
        while ((T = scan.nextLine()) != null) {
            if (T.equals("END_OF_TEXT")) {
                break;
            }
            String[] str = T.split(" ");
            for (int i = 0; i < str.length; i++) {
                if(str[i].equalsIgnoreCase(W)) {
                    count++;
                }
            }
        }
            System.out.println(count);
    }
}