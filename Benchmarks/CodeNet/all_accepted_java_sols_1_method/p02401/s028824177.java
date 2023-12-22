import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String line = sc.nextLine();
            String[] data = line.split(" ");
            int a = Integer.parseInt(data[0]);
            int b = Integer.parseInt(data[2]);
            if (data[1].equals("+")) {
                System.out.println(a + b);
            } else if (data[1].equals("-")) {
                System.out.println(a - b);
            } else if (data[1].equals("*")) {
                System.out.println(a * b);
            } else if (data[1].equals("/")) {
                System.out.println(a / b);
            } else if (data[1].equals("%")) {
                System.out.println(a % b);
            } else if (data[1].equals("?")) {
                break;
            }
        }
        sc.close();
    }
}

