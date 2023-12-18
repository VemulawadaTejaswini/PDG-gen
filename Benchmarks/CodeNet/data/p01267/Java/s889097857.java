import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	public void run() {
		try {
			// ??????????????????????????????
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int count = 0;
			while(true){
				int largeN = 0,a = 0,b = 0,c = 0,x = 0;
				String[] imputNumber = br.readLine().split(" ",-1);
				ArrayList<Integer> frame = new ArrayList<Integer>();
				count++;
				if(count/2 == 1) {
					largeN = Integer.parseInt(imputNumber[0]);
					a = Integer.parseInt(imputNumber[1]);
					b = Integer.parseInt(imputNumber[2]);
					c = Integer.parseInt(imputNumber[3]);
					x = Integer.parseInt(imputNumber[4]);

					for(int i = 0; i<10000; i++){
						if(i == 0){
							frame.add(x);
						} else {
							x = (a*x+b)%c;
							frame.add(x);
						}
					}
				} else {
					int luckNumber = 0;
					int answer = 0;
					for (int k = 0; k<imputNumber.length; k++){
						luckNumber =frame.indexOf(Integer.parseInt(imputNumber[k]));
						if(-1 !=luckNumber){
							System.out.println("-1");
							break;
						}
				        Iterator<Integer> it = frame.iterator();
				        int count1 = 0;
				        while(it.hasNext()){
				            int i = it.next();
				            if(i != Integer.parseInt(imputNumber[k])) {
				            	it.remove();
				            } else {
				            	if(answer < count1){
					            	answer = count1;
					            	break;
				            	} else {
				            		continue;
				            	}
				            }
				            count1++;
				        }
					}
					System.out.println(answer);

				}
			}
		} catch (Exception e) {
			e.getStackTrace();
			System.exit(0);
		}
	}
}