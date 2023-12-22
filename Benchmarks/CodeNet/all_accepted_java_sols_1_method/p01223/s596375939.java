

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args){

		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> listAnswer = new ArrayList<Integer>();

		try{

			String strTurn = insBR.readLine();
			int intTurn = Integer.parseInt(strTurn);

			for(int i = 0; i < intTurn; i++){
				insBR.readLine();

				List <Integer> listMountain = new ArrayList<Integer>();

				String[] strMountain = insBR.readLine().split(" ");
				for(int j = 0; j < strMountain.length; j++){
					int intMountain = Integer.parseInt(strMountain[j]);
					listMountain.add(intMountain);
				}


				int intClimb = 0;
				int intDescend = 0;

				for(int j = 0; j + 1 < listMountain.size(); j++){
					int intDistance = listMountain.get(j + 1) - listMountain.get(j);
					if(intClimb < intDistance){
						intClimb = intDistance;
					}else if(intDistance < 0){
						intDistance = Math.abs(intDistance);
						if(intDescend < intDistance){
							intDescend = intDistance;
						}
					}
				}

				listAnswer.add(intClimb);
				listAnswer.add(intDescend);

			}

		}catch(IOException e){
		 	e.printStackTrace();
		}catch(NumberFormatException e){
			e.printStackTrace();
		}

		for(int i = 0; i < listAnswer.size(); i++){
			int intDiv = i % 2;
			if(intDiv == 0){
				System.out.print(listAnswer.get(i) + " ");
			}else{
				System.out.println(listAnswer.get(i));
			}
		}

	}
}

