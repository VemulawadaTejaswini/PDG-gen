import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();	//１行目の文字を読み取る
        String p = br.readLine();	//２行目の文字を読み取る
        sb.append(s);				//sbに加えることにより文字の最後と最初を繋げた
        sb.append(s);
        if(sb.indexOf(p) != -1){
        	//指定文字列が対象文字列中の何番目に出現するかをindexOfで調べ
        	//対象文字列がなかった場合には-1が出るので!=条件にした
        	System.out.println("Yes");
        	//-1以外だったらYesが出力される
        }else{
        	System.out.println("No");
        	//-1だったらNoが出力される
        }
     }
}