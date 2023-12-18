//import java.io.File;
import java.util.Scanner;

class Main{
	static int[] arr;
	public static void main(String[] args) {
try{
		//Scanner scan = new Scanner(new File("in.txt"));
		Scanner scan = new Scanner(System.in);


		int input1 = scan.nextInt();
		arr = new int[input1];
		for(int i = 0; i < input1; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println(getCarpet(0,input1-1,1)+1);
		

}catch(Exception e) {
	e.printStackTrace();
}
	}

	//start,end,height
	static int getCarpet(int _s, int _e, int _h) {
//System.out.println(_s+","+_e+","+_h);
		int sum = 0;
		boolean flag = true;

		for(int i = _h; flag; i++) {
			int start = -1;
			boolean dummyFlag = true;
			boolean dummyFlag2 = true;
			for(int j = _s; j <= _e; j++) {
				if(arr[j]-i > 0) {
					dummyFlag = false;
					if(start == -1) {
						start = j;
					}
				}else {
					dummyFlag2 = false;
					if(start != -1) {
						sum += getCarpet(start,j-1,i+1)+1;
						flag = false;
						start = -1;
					}
				}
			}
			if(start != -1 && !dummyFlag2) {
				sum += getCarpet(start,_e,i+1)+1;
				break;
			}
			//if(flag && start == -1) break;
			if(dummyFlag) break;
		}

		return sum;
	}
}