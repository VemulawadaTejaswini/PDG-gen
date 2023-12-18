import java.util.Scanner;
class test {
        public static void main(String[] args){
                Scanner std = new Scanner(System.in);
                int a = std.nextInt();
                int b = std.nextInt();
                if(a < b) System.out.println("a < b");
                if(a > b) System.out.println("a > b");
                if(a == b) System.out.println("a == b");
        }
}