import java.util.Scanner;

class Main {
    static final int hMin = 60;
    static final int hSec = 3600;
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        int hs = input.nextInt();
        int ms = hs%hSec;
        int cs = ms%60;
        System.out.println(hs/hSec+":"+ms/hMin+":"+cs);
    }
}