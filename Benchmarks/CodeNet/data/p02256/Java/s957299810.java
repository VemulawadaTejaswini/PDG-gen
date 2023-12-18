import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        /*xとyの最大公約数はyとx%yの最大公約数と同じなのでx%y==0になるまで入れ替えればyが最大公約数となる*/
        while(x%y!=0){
            int tmp = x%y; //tmpに一時的にx%yを格納し入れ替え
            x = y;
            y = tmp;
        }
        System.out.println(y);
    }
}
