import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		double total = 0.0; //合計点
        double m = 0.0; //平均点
        double a = 0.0; //分散
        double stdev = 0.0;
        Scanner sc =new Scanner(System.in);

        while(true){
        	//System.out.print("学生数は >");
            int n = Integer.parseInt(sc.next());//学生の数
        	if(n==0){
        		break;
        	}
        	int points[] = new int[n];

            for (int i=0; i<n; i++) {
                points[i] = Integer.parseInt(sc.next());
                total += points[i];
            }

            //System.out.println("合計点は" + total);

            m = total / n;
            //System.out.println("平均点は" + m);

            for (int i=0; i<n; i++) {
                a += ((points[i] - m)*(points[i] - m));
            }
            //System.out.println("分散は" + a/n);

            stdev = Math.sqrt(a/n);
            System.out.println(stdev);
        }
	}

}

