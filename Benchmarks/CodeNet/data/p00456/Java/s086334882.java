import java.util.*;


public class Main {
	//template
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//
		new Main().aoj0533();
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
	
	void aoj0533(){
		int[] wp = new int[10];
		int[] kp = new int[10];
		for(int i=0; i<10; i++){ wp[i] = sc.nextInt(); }
		for(int i=0; i<10; i++){ kp[i] = sc.nextInt(); }
		
		Arrays.sort(wp); Arrays.sort(kp);
		System.out.println((wp[9]+wp[8]+wp[7]) + " " + (kp[9]+kp[8]+kp[7]));
	}
}