import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        while(true){
    		double total = 0.0; //合計点
            double m = 0.0; //平均点
            double a = 0.0; //分散
            double stdev = 0.0;

            //学生の数
            int n = Integer.parseInt(sc.next());
        	if(n==0){
        		break;
        	}
        	//入力した分だけの配列内変数作成
        	int points[] = new int[n];

        	//合計
            for (int i=0; i<n; i++) {
                points[i] = Integer.parseInt(sc.next());
                total += points[i];
            }

            //平均
            m = total / n;

            //分散
            for (int i=0; i<n; i++) {
                a += ((points[i] - m)*(points[i] - m));
            }

            //標準偏差
            stdev = Math.sqrt(a/n);
            System.out.println(stdev);
        }
	}

}

