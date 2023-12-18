 import java.io.*;
 
class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
        String str = null;//
        while ((str = line.readLine()) != null) {//入力があれば繰り返しの開始
            String[] arr = str.split(" ");//入力文字列をスペースで分割し、配列に格納
            if ("0".equals(arr[0]) && "0".equals(arr[1]))//一つ目と二つ目の入力を評価
                break;
            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[1]);
 
            if (a > b)//表示で比較処理
                System.out.println(y + " " + x);
            else
                System.out.println(x + " " + y);
        }
    }
}