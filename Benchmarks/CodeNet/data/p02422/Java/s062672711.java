public class Main {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        int q = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < q; i ++) {
            String[] command = sc.nextLine().split(" ");
            int a = Integer.parseInt(command[1]);
            int b = Integer.parseInt(command[2]) + 1;

            if (command[0].equals("print")) { System.out.println(str.substring(a, b)); }
            if (command[0].equals("reverse")) {
                StringBuilder br = new StringBuilder(str.substring(a, b));
                br.reverse();
                str.replace(a, b, br.toString());
            }
            if (command[0].equals("replace")) { str.replace(a, b, command[3]); }
        }
    }
}