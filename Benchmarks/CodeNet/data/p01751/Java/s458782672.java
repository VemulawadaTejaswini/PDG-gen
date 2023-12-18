import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tmpArray = br.readLine().split(" ");
		int a = Integer.parseInt(tmpArray[0]);
		int b = Integer.parseInt(tmpArray[1]);
		int c = Integer.parseInt(tmpArray[2]);
		
		int result = -1;
		int wake = a - 1;
		int sleep = b;
		boolean awake = true;
		//????????§???60??±??????????????°???????????????
		for(int i = 1; i <= 60*60; i++){
//			if(awake){
//				System.out.println("time "+i+": awake");
//			}
//			else{
//				System.out.println("time "+i+": sleep");
//			}
			
			if(i == c && awake){
				result = i;
				break;
			}
			
			if(i % 60 == 0){
				c += 60;
			}
			
			wake--;
			sleep--;
			if(awake && wake < 0){
				awake = false;
				sleep = b - 1;
			}
			else if(!awake && sleep < 0){
				awake = true;
				wake = a - 1;
			}
			


		}
		
		System.out.println(result);
	}

}