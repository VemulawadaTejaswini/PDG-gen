import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input= sc.nextLine();
        String inputs[] = input.split(" ");
        int a  = Integer.valueOf(inputs[0]);
        int b = Integer.valueOf(inputs[1]);
        int area = (a*b)/2;
        System.out.println(area);
    }
}