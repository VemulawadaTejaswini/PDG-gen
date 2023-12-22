import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
        int H = sc.nextInt();
        int W= sc.nextInt();
        if (H == 0 && W == 0) {
        break;
        }
        // 二重ループ(forの中にfor)を書いて、. と # を交互に表示しよう！
        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                if(a==0){
                    System.out.print("#");
                    a = 1;
                }else{
                    System.out.print(".");
                    a = 0;
                }
            }
            System.out.println();
            if(b==0){
                a=1;
                b=1;
            }else{
                a=0;
                b=0;
            }
        }
        System.out.println();
        a = 0;
        b=0;
        }


        
        sc.close();
        }
}
