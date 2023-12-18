

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void main(String[] args){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		try{

			//数値読み取る。
			List<Integer> list = new ArrayList<Integer>();
			int intSum = 0;
			while(true){
				String[] strLine = insBR.readLine().split("");
				if(!"0".equals(strLine[0])){
					for(int j = 0; j < strLine.length; j++){
						intSum += Integer.parseInt(strLine[j]);
					}
				}else{
					break;
				}
				list.add(intSum);
				intSum = 0;
			}

			//出力。
			for(int i = 0; i < list.size(); i++){
				System.out.println(list.get(i));
			}

		}catch(IOException e){
			e.printStackTrace();
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
	}

}

