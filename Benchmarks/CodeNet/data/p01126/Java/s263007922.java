
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException{
		// インプットデータ取得
		Scanner sc = new Scanner(System.in);

        while(true) {

        int n_tatesen = sc.nextInt();//2
        int m_yokosen = sc.nextInt();//1
        int a_selected = sc.nextInt();//2

        if(n_tatesen==0&&m_yokosen==0&&a_selected==0) {
        	break;}

        int height, p_tatesen, q_tatesen;
        int[][] map = new int[1001][n_tatesen+1];
        for(int i=0;i<m_yokosen;i++) {
        	//横線がわたる高さと縦線番号を取得
        	height=sc.nextInt();//1
        	p_tatesen=sc.nextInt();//1
        	q_tatesen=sc.nextInt();//2
        	//高さが決まるとき、小さい側の縦線が3番だったら
        	//3から4か4から3のどちらかになるが、それは自分の現在地次第
        	map[height][p_tatesen]=q_tatesen;//2
        	System.out.println(map[1][1]);
        	map[height][q_tatesen]=p_tatesen;//1
        	System.out.println(map[1][2]);
        }

        //現在地がaなので、3番にいるときの行先がmapの値に入っている
        //高い順でループを回す
        for(int i=1001;i>0;i--) {
        	System.out.println(a_selected);
        	if(map[i][a_selected]!=0) {
        		a_selected=map[i][a_selected];
        	}
        }
        System.out.println(a_selected);

	}
}
	 public static void ScanYokosen(){
		 //横線のデータを取得する

	 }

	 public static void SelectYokosen(){
		 //選んだ縦線から必要な線だけ抜き出して、高さ順に並べる
	 }

}

