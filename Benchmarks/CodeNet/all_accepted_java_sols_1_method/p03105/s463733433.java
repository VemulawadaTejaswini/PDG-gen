import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        //入力
        Scanner scn=new Scanner(System.in);
        int sound=scn.nextInt();
        int hand=scn.nextInt();
        int fin=scn.nextInt();
        int answer=0;
        //処理
       if(hand/sound>=fin){
           answer = fin;
       }else{
           answer = hand/sound;
       }
       //出力
       System.out.println(answer);
    }
}
