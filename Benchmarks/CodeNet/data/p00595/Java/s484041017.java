import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
            System.out.println(GCD(sc.nextInt(),sc.nextInt()));
    }
    static int GCD(int x,int y) {
        return x==0?y:GCD(y%x,x);
    }
}
