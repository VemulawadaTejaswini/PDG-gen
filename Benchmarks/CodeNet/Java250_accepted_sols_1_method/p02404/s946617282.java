import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)throws Exception{
        Scanner scan = new Scanner(System.in);
        int H = 0;
        int W = 0;
        String w = "";
        String h = "";
        int judge = 0;
        while(judge == 0){
            H = scan.nextInt();
            W = scan.nextInt();
            //w,hは繰り返し使うので、その都度初期化する
            if(judge == 0){
                w = "";
                h = "";
            }
            if(H == 0 && W == 0){
                judge = 1;
            }else{
                for(int i = 0;i <= W - 1;i++){    
                   w = w + "#";
                   if(i == 0 || i == W - 1){
                       h = h + "#";
                   }else{
                       h = h + ".";
                   }
                }
                //最初の行(I=0)と最後の行(I=H-1)は#連続のwを使う
                for(int I = 0;I <= H - 1;I++){
                   if(I == 0){
                       System.out.println(w);
                   }else if(I > 0 && I < H - 1){
                       System.out.println(h);
                   }else if(I == H - 1){
                       System.out.println(w + "\r\n");
                   }
                }
            }
        }
    }
}
