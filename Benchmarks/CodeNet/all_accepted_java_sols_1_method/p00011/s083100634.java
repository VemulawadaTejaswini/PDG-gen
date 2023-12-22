import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt();//縦線の数
        int n = scan.nextInt();//横線の本数
        int[] amida = new int[w];
        int copy = 0;
        for(int i=0;i<amida.length;i++){
            amida[i] = i+1;
        }
        while(n-->0){
            String str = scan.next();
            String[] ab = str.split(",");
            int a = Integer.parseInt(ab[0]) - 1;
            int b = Integer.parseInt(ab[1]) - 1;
            copy = amida[a];
            amida[a] = amida[b];
            amida[b] = copy;
        }
        for(int s: amida){
            System.out.println(s);
        }
    }

}
