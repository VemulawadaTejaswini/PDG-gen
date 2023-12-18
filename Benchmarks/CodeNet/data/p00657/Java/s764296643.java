import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
            int r = sc.nextInt();
            int c = sc.nextInt();
            if (r == 0 || c==0) break;
            if (r*c %2 ==0) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
