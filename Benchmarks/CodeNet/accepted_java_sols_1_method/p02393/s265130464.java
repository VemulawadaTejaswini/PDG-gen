import java.util.*;
import java.io.*;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        while(sc.hasNext()){
            num.add(sc.nextInt());
        }
        int listSize = num.size()-1;
        for(int i=0;i<listSize;i++){
            for(int j=0;j<(listSize)-i;j++){
                // j番目とj+1番目の要素を比較して
                // j番目の方が大きかったとき、2つの要素を入れ替える
                if(num.get(j)>num.get(j+1)){
                    int x = num.get(j);
                    int y = num.get(j+1);
                    num.set(j,y);
                    num.set(j+1,x);
                }
            }
        }
        for(int k=0;k<num.size();k++){
            if(k==num.size()-1){System.out.println(num.get(k));}
            else{System.out.print(num.get(k) + " ");}
        }
    }
}