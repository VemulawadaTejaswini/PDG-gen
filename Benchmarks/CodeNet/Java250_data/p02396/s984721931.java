import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main{

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<Integer>();

		while(true){

			int num = Integer.parseInt(br.readLine());

			if(num != 0){
				list.add(num);
			}else{
				break;
			}

		}

		for(int i = 0; i < list.size(); i++){
			System.out.println("Case " + (i + 1) + ": " + list.get(i));
		}

	}
}