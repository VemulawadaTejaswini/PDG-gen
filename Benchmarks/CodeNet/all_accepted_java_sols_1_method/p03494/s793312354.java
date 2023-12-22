import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブScanner scan = new Scanner(System.in);

        Scanner scan = new Scanner(System.in);

        // 入力値の個数
        int n = scan.nextInt();

        // カウント
        int count = 0;

        boolean flag = true;

        // 入力値のリスト
        ArrayList<Integer> list = new ArrayList();

        for(int i = 0; i < n; i++) {
        	list.add(scan.nextInt());
        }

        // 入力された値を表示
        for(int i = 0; i < list.size(); i++) {

        	// 値が奇数ならフラグflase
        	if((int)list.get(i)%2 != 0) {
        		flag = false;
        	}

        	//System.out.println("listの"+ i + "番目 => " + list.get(i));
        }


        while(flag) {
        	for(int i = 0; i < list.size(); i++) {


            	list.set(i, (int)list.get(i)/2);
            	//System.out.println("listの"+ i + "番目 => " + list.get(i));
            	if((int)list.get(i)%2 != 0) {
            		flag = false;
            	}


            }
        	count++;
        }

        System.out.println(count);
	}

}
