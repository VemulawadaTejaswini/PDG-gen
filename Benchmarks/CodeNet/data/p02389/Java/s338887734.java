import java.util.Scanner;

class Main{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int x = Integer.parseInt(in.next());
        int y = Integer.parseint(in.next());
        int z = x * y;
        int w = 2 * z;
        System.out.println(z + " " + w);
    }
}