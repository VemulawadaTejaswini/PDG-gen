import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int num = Integer.parseInt(scan.nextLine());

        for(int i = 0; i < num; i++) {
            String[] line = scan.nextLine().split(" ");
            String order = line[0];
            int first = Integer.parseInt(line[1]);
            int end = Integer.parseInt(line[2]) + 1;

            if (order.equals("replace")) {
                if (first == 0) {
                    str = line[3].concat(str.substring(end));
                } else if (end == str.length()) {
                    str = str.substring(0, first).concat(line[3]);
                } else {
                    str = str.substring(0, first).concat(line[3]).concat(str.substring(end));
                }

            } else if (order.equals("reverse")) {
                if (first == 0) {
                    str = new StringBuffer(str.substring(0, end)).reverse().toString().concat(str.substring(end));
                } else if(end == str.length()) {
                    str = str.substring(0, first).concat(new StringBuffer(str.substring(first)).reverse().toString());
                } else {
                    str = str.substring(0, first).concat(new StringBuffer(str.substring(first, end)).reverse().toString()).concat(str.substring(end));
                }
            } else if (order.equals("print")) {
                String ans = str.substring(first, end);
                System.out.println(ans);
            }
        }
    }
}