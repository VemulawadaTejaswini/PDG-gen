import java.util.*;
public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            //中間試験
            int m = Integer.parseInt(sc.next());
            //期末試験
            int f = Integer.parseInt(sc.next());
            //再試験
            int r= Integer.parseInt(sc.next());
            //全て-1の場合処理終了
            if(m+f+r == -3) break;
            
            System.out.println(grades(m,f,r));
            
        }
    }
    //成績
    public static String grades(int m, int f, int r){
        //中間試験、期末試験のいずれかが-1(欠席)の場合はF
        if(m == -1 || f == -1) return "F";
        //中間試験と期末試験の合計点数
        int sum = m+f;
        //合計点数80以上ならばA
        if(sum >= 80) return "A";
        //合計点数65以上80未満ならばB
        else if(sum >= 65 && sum < 80) return "B";
        //合計点数50以上65未満ならばC
        else if(sum >= 50 && sum < 65) return "C";
        //合計点数30以上50未満ならば
        else if(sum >= 30 && sum < 50){
            //再試験の点数50以上ならばC
            if(r >= 50) return "C";
            //上記以外ならばD
            else return "D";
        }
        //合計点数30未満ならばF
        else return "F";
    }

}

