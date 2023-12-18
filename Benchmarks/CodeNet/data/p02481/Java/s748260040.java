import java.util.Scanner;
class Main{

    public void solve(){
        Scanner sc = new Scanner(System.in);
        int tate, yoko, naga, syuu;
        tate = sc.nextInt();
        yoko = sc.nextInt();

        naga = tate * yoko;
        syuu = (tate * 2) + (yoko * 2);

        System.out.println(naga);
        System.out.print(syuu);

    }

    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}