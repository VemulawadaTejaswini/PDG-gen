import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        //入力
        Scanner scn=new Scanner(System.in);
        int[] anntena=new int[5];
        anntena[0]=scn.nextInt();
        anntena[1]=scn.nextInt();
        anntena[2]=scn.nextInt();
        anntena[3]=scn.nextInt();
        anntena[4]=scn.nextInt();
        int limit=scn.nextInt();
        //処理と出力
        if(anntena[4]-anntena[0]>limit){
            System.out.println(":(");
        }else{
            System.out.println("Yay!");
        }
    }
}
