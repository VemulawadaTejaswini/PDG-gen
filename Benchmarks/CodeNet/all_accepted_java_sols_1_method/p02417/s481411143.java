

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void main(String[] args){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		try{
			//アルファベットのリストを作成。
			char[] chAlf = new char[26];
			char chSubAlf = 'a';
			for(int i = 0; i < chAlf.length; i++){
				chAlf[i] = chSubAlf;
				chSubAlf++;
			}


			//文字を読み取る。
			char[] chLine = new char[1200];
			List<String> list = new ArrayList<String>();
			while(true){
				String strLine = insBR.readLine();
				if(strLine != null && !"".equals(strLine)){
					String[] strLine2 = strLine.split("");
					for(int j = 0; j < strLine2.length; j++){
						list.add(strLine2[j]);
					}
				}else{
					break;
				}
			}

				/*chLine[i] = strLine[i].charAt(i);
				chLine[i] = Character.toLowerCase(chLine[i]);
				System.out.println("chLine" + chLine[i]);*/


			for(int i = 0; i <list.size(); i++){
				chLine[i] = list.get(i).charAt(0);
				chLine[i] = Character.toLowerCase(chLine[i]);
			}

			//文字を数える。
			int[] intCount = new int[chAlf.length];
			for(int i = 0; i < chLine.length; i++){
				for(int j = 0; j < chAlf.length; j++){
					if(chLine[i] == chAlf[j]){
						intCount[j]++;
					}
				}
			}

			//出力。
			for(int i = 0; i < chAlf.length; i++){
				System.out.println(chAlf[i] + " : " + intCount[i]);
			}

		}catch(IOException e){
			e.printStackTrace();
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
	}

}

