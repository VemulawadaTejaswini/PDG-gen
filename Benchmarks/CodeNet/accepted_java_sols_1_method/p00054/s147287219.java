import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null;
		char c = 0;


		ArrayList<Double> al = new ArrayList<Double>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();

		while(true){
			try {
				tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			if(tes == null){
				break;
			}
			if(tes.equals("")){
				break;
			}
//			try{
				String[] fruit = tes.split(" ", 0);
				al.add(Double.parseDouble(fruit[0])/Double.parseDouble(fruit[1]));
				al2.add(Integer.parseInt(fruit[2]));
//			}catch(NumberFormatException e){
//				break;
//			}

			
			//al.add(a);
		}
		
		for(int r=0;r<al.size();r++){
			String sss = String.valueOf(al.get(r));
			int e = -1;
			int pri = 0;
			for(int i=0;i<sss.length();i++){
				if(e == al2.get(r)){
					break;
				}
				if(e >= 0){
					pri += Integer.parseInt(String.valueOf(sss.charAt(i))); 
					e++;
				}
				if(sss.charAt(i) == '.'){
					e = 0;
				}
			}
			
			System.out.println(pri);
		}
		
		
	}

}