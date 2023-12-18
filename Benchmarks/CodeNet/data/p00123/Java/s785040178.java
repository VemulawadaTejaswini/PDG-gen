import java.util.*;

public class Main{
	double [][] time = {{35.5, 71.0}, {37.5, 77.0}, {40.0, 83.0}, {43.0, 89.0},
			{50.0, 105.0}, {55.0, 116.0}, {70.0, 148.0}};
	String [] rank = {"AAA", "AA", "A", "B", "C", "D", "E"};
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			double sec500 = sc.nextDouble();
			double sec1000 = sc.nextDouble();
			int len = time.length;
			boolean flg = true;
			for(int i = 0; i < len; i++){
				if(sec500 < time[i][0] && sec1000 < time[i][1]){
					System.out.println(rank[i]);
					flg = false;
					break;
				}
			}
			if(flg){
				System.out.println("NA");
			}
		}
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}