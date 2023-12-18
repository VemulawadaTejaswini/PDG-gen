import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n+1];
        int sum = 0; // 取り除くべき要素の個数
        
        for(int i=1; i<=n; i++){
            int a = sc.nextInt();
            //入力された数字よりも配列の要素数が少なかったら無条件に取り除く
            //その数字を排除する数がSumなので1足す。
            if(a>n) sum++;
            else b[a]++;
        }
        for(int i=1; i<=n; i++){
            //配列の添え字と中身が一致しているとき
            if(i == b[i]) continue;
            //配列の中身よりも添え字が大きいときは全部取り除く
            if(i > b[i]) sum += b[i];
            //配列の中身よりも添え字が小さいときは 
            //”添え字 ＝ 配列の中身”となるように余った分を取り除く
            if(i < b[i]) sum =  sum + b[i] - i;
        }
        System.out.println(sum);
    }
}