import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;

public class Main{
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        //キー入力
        getLine();
        List<String> strings = getStrOnLine();
        //計算
        int n = bubbleSort(strings);
        //出力
        String out = String.join(" ",strings);
        System.out.println(out);
        System.out.println(n);
    }

    private static int bubbleSort(List<String> list){ 
        boolean flag = true;
        int n = 0;
        while (flag){
            flag = false;
            for (int j = list.size() - 1 ; j >= 1; j--){
                int a = Integer.parseInt(list.get(j));
                int b = Integer.parseInt(list.get(j - 1));
                if (a < b){
                    String tmp = list.get(j);
                    list.set(j, list.get(j-1));
                    list.set(j - 1, tmp);
                    n++;
                    flag = true;
                }
            }
        }
        return n;
    }
    

    //キー入力メソッド
    public static String getLine() throws IOException {
        String str = br.readLine();
        return str;
    }
    
    //キー入力メソッド
    public static List<String> getStrOnLine() throws IOException {
        List<String> list = new ArrayList<>();
        String line = getLine();
        
        list.addAll(Arrays.asList(line.split(" ")));
        return list;
    }
}
