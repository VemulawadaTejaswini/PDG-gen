import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        //入力
        Scanner scn=new Scanner(System.in);
        char base=scn.next().charAt(0);
        //処理
        char answer='A';
        switch(base){
                case 'A':
                    answer='T';
                    break;
                case 'T':
                    answer='A';
                    break;
                case 'C':
                    answer='G';
                    break;
                case 'G':
                    answer='C';
                    break;
        }
        //出力
        System.out.println(answer);
    }
}