import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		while(sc.hasNext()){
			new aoj0110().doIt();
		}
	}
	class aoj0110{
		char num[] = {'0','1','2','3','4','5','6','7','8','9'};
		void doIt() {
			String str = sc.next();
			char ctr[] = str.toCharArray();
			String a = "",b = "",c = "";
			for(int i = 0;i < 10;i++){
				a = "";b = "";c = "";
				int cnt = 0;
				for(int j = 0;j < ctr.length;j++){
					if(ctr[j] == '+')cnt++;
					else if(ctr[j] == '=')cnt++;
					else{
						if(cnt == 0){
							if(ctr[j] == 'X')a = a + num[i];
							else a = a + ctr[j];
						}else if(cnt == 1){
							if(ctr[j] == 'X')b = b + num[i];
							else b = b + ctr[j];
						}else if(cnt == 2){
							if(ctr[j] == 'X')c = c + num[i];
							else c = c + ctr[j];
						}
					}
				}
				BigInteger numa = new BigInteger(a);
				BigInteger numb = new BigInteger(b);
				BigInteger numc = new BigInteger(c);
				BigInteger tashi = numa.add(numb);
				if(tashi.equals(numc)){
					System.out.println(i);
					break;
				}
				if(i == 9)System.out.println("NA");
			}
		}
	}
}