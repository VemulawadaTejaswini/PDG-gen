import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] bubbleAry =  br.readLine().split(" ");
		String[] selectAry = (String[])bubbleAry.clone();

		bubbleSort(n,bubbleAry);
		selectSort(n, selectAry);

		if(isStable(n,bubbleAry,selectAry)){
			System.out.println("Stable");
		}else{
			System.out.println("Not stable");
		}

	}

	public static void bubbleSort(int n, String[] cardAry){
		boolean flag = true;
		int y = 1;
		while(flag){
			flag = false;
			for(int i = n - 1 ; y <= i ; i-- ){
				if( (int)cardAry[i].charAt(1) < (int)cardAry[i - 1].charAt(1)){
					String tmp = cardAry[i];
					cardAry[i] = cardAry[i - 1];
					cardAry[i - 1] = tmp;
					flag = true;
				}
			}
			y++;
		}

		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < n; i++){
			sb.append(cardAry[i]);
			sb.append(" ");
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
		System.out.println("Stable");
	}

	public static void selectSort(int n,String[] cardAry){
		int count = 0;
		for(int i = 0 ; i < n ; i++){
			int minIndex = i;
			for(int y = i + 1 ; y < n ; y++){
				if((int)cardAry[minIndex].charAt(1) > (int)cardAry[y].charAt(1)){
					minIndex = y;
				}
			}
			if(minIndex != i){
				String tmp = cardAry[minIndex];
				cardAry[minIndex] = cardAry[i];
				cardAry[i] = tmp;
				count++;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < n; i++){
			sb.append(cardAry[i]);
			sb.append(" ");
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
	}

	public static boolean isStable(int n,String[] bubbleAry,String[] selectAry){

		for(int i = 0; i < n ; i++){
			if(!bubbleAry[i].equals(selectAry[i])) return false;
		}
		return true;
	}

}