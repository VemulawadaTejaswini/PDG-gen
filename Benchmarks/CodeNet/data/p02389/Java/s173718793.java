import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] array = str.split(" ");
        int a = Integer.perseInt(array[0]), b = Integer.perseInt(array[1]);
        System.out.println(a * b + " " + a * 2 + b * 2);
    }

}