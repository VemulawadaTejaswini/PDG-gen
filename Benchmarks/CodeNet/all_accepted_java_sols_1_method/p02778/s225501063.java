import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String h = scan.next();
        scan.close();

        for(int i = 0; i < h.length(); i++) System.out.print("x");
    }
}