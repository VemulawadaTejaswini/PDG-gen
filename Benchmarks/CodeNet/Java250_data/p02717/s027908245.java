import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	    String result = execute(sc.nextInt(),sc.nextInt(),sc.nextInt());
        System.out.println(result);
    }

    public static String execute(int x, int y, int z){
        //偶数と偶数、奇数と奇数でのみ組み合わせ
        return z + " " + x + " " + y;
    }
}
