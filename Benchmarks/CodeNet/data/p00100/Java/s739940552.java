import java.util.HashMap;
import java.util.Scanner;
class Main {
	long[][] total;
	Scanner scan = new Scanner(System.in);
	HashMap<Integer,Integer> hm;
	
	public static void main(String args[]){
		Main app = new Main();
		
		
		while(true){
			if(app.input() == -1){
				break;
			}
			app.exec();
		}
	}
	
	public int input(){
		int count=0,n,number;
		hm = new HashMap<Integer,Integer>();
		
		n = scan.nextInt();
		if(n == 0){
			return -1;
		}
		total = new long[n][2];
		for(int i=0;i<n;i++){
			number = scan.nextInt();
			if(hm.containsKey(number)){
				total[hm.get(number)][1] += scan.nextLong()*scan.nextLong();
			}else{
				total[count][0] = number;
				total[count][1] = scan.nextLong()*scan.nextLong();
				hm.put(number,count);
				count++;
			}
		}
		
		return 1;
	}
	
	public void exec(){
		boolean flag = true;
		
		for(int i=0;i<hm.size();i++){
			if(total[i][1] >= 1000000){
				System.out.println(total[i][0]);
				flag = false;
			}
		}
		if(flag){
			System.out.println("NA");
		}
	}
}