import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new Main();	
	}

	public Main() {
		while(sc.hasNext()){
			new aoj1153().doIt();
		}
	}
	class aoj1153 {
		void doIt() {
			while(true){
				int n = sc.nextInt();
				ArrayList<Integer> array = new ArrayList<Integer>();
				if(n == 1)break;
				System.out.print(n+":");
				for(int i = 0;i <= n;i++){
					if(i == 1)continue;
					boolean sosu = true;
					if(i % 7 == 1 || i % 7 == 6){
						if(n % i == 0){
							for(int j = 0;j < array.size();j++){
								if(i % array.get(j) == 0)sosu = false;
							}
							if(sosu){
								array.add(i);
								System.out.print(" "+i);
							}
						}
					}
				}
				System.out.println();
			}
		}
	}
}