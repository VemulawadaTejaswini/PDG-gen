import java.util.*;


public class Main {
	//template
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//
		new Main().aoj0532();
	}

	int min(int[] arr){
		int ret = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(ret>arr[i])ret = arr[i];
		}
		return ret;
	}
	
	int max(int[] arr){
		int ret = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(ret<arr[i])ret = arr[i];
		}	
		return ret;
	}
	
	int sum(int[] array){
		int sum = 0;
		for(int v : array){
			sum += v;
		}
		return sum;
	}
	
	
	//--------------------------
	
	void aoj0532(){
		for(int i = 0; i < 3; i++){
			int in = sc.nextInt()*60*60+sc.nextInt()*60+sc.nextInt();
			int out = sc.nextInt()*60*60+sc.nextInt()*60+sc.nextInt();
			int diff = out - in;
			
			int h = diff/(60*60);
			diff -= h*60*60;
			int m = diff/60;
			diff -= m*60;
			int s = diff;
			
			System.out.println(h+" "+m+" "+s);
		}
	}
	
	void aoj0533(){
		int[] wp = new int[10];
		int[] kp = new int[10];
		for(int i=0; i<10; i++){ wp[i] = sc.nextInt(); }
		for(int i=0; i<10; i++){ kp[i] = sc.nextInt(); }
		
		Arrays.sort(wp); Arrays.sort(kp);
		System.out.println((wp[9]+wp[8]+wp[7]) + " " + (kp[9]+kp[8]+kp[7]));
	}
	
	
}