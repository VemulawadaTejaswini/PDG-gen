import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();

        boolean count = false;

        if(a == b) count = !count;
        else if(a == c) count = !count;
        if(b == c) count = !count;
        
        if(count) System.out.println("Yes");
        else System.out.println("No");
    }
}