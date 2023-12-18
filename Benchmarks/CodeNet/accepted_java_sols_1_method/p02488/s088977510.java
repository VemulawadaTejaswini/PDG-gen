import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String first = input.next();

        while (--n > 0){
            String tmp = input.next();
            if (first.compareTo(tmp) > 0) first = tmp;
        }
        System.out.println(first);
    }
}