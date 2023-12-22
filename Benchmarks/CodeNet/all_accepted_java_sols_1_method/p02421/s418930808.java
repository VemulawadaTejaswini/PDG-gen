import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int card = Integer.parseInt(br.readLine());    //cardに勝負回数を入れる
        String name;
        int t_point=0;
        int h_point=0;
        while ((name=br.readLine())!=null) {
        	if (card>1000 || name.length()>100) break; //cardが1000より大きい場合と、nameの長さが100を超えた場合whileを抜ける
            String[] c_name = name.split(" ");  //splitで空白でnameに入っている文字を区切る
            String tarou = c_name[0];
            String hanako = c_name[1];
            
            int judge = tarou.compareTo(hanako);    //compareToで文字列の大小を比較する
                                                    //compareToは比較した文字列が
                                                    //後になる場合には正数を、等しい場合には0を、前になる場合には負数を返します。
            //勝者が3ポイントプラスで引き分けなら両者に1ポイントプラスします
            if(judge<0){        //if文でjudgeが0より小さい場合には
                h_point += 3;   //花子の方にポイントをプラスします
            }else if(judge>0){  //else ifでjudgeが0より大きい場合には
                t_point += 3;   //太郎の方にポイントをプラスします
            }else{              //elseでjudgeが0の時には
                h_point += 1;   //互いのポイントにプラスします
                t_point += 1;
            }
        }
        System.out.println(t_point+" "+h_point);
    }
}