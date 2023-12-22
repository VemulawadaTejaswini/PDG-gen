import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int X = sc.nextInt();

        float val = (float)T / X;
        System.out.println(val);
    }
}