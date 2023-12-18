import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        for (String s = input.next(); !s.equals("-"); s = input.next()){
            int n = input.nextInt();
            int l = s.length();

            while (n-- > 0){
                int h = input.nextInt();
                s = s.substring(h, l) + s.substring(0, h);
            }
            System.out.println(s);
        }
    }
}