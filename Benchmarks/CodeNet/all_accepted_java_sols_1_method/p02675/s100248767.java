import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //切り出しする文字列
        int N = sc.nextInt();
        String Nst = String.valueOf(N);
        String Anst = Nst.substring(Nst.length() - 1);
        int Ans = Integer.parseInt(Anst);
        if(Ans == 2 || Ans == 4 || Ans == 5 || Ans == 7|| Ans == 9){
            System.out.println("hon");
        }
        if(Ans == 0 || Ans == 1 || Ans == 6 || Ans == 8){
            System.out.println("pon");
        }
        if(Ans == 3){
            System.out.println("bon");
        }
    }
}