import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
		InputStreamReader input = new InputStreamReader (System. in);
		BufferedReader buffer = new BufferedReader(input);
		String scan = buffer.readLine();
		long processStart = System.currentTimeMillis();

		int numberAmount = Integer.parseInt(scan);
		scan = buffer.readLine();
		String[] scanSplit = scan.split(" ");
		int[] number = new int[numberAmount];
		for(int i=0; i<numberAmount; i++){
			number[i] = Integer.parseInt(scanSplit[i]);
		}
		scan = buffer.readLine();
		int questionAmount = Integer.parseInt(scan);
		scan = buffer.readLine();
		scanSplit =  scan.split(" ");
		int[] question = new int[questionAmount];
		for(int i=0; i<questionAmount; i++){
			question[i] = Integer.parseInt(scanSplit[i]);
		}
		
		boolean makeAble = false;
		for(int i=0; i<questionAmount; i++){
			makeAble = solve(number,question[i],0);
			if(makeAble == true){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
		}
		
		long processEnd = System.currentTimeMillis();
		    	//System.out.println("???????????????" + (processEnd - processStart)  + "ms");
	}

	public static boolean solve(int[] num,int quest, int nowNum){
		if (quest == 0){
			return true;
		}
		if (quest < 0 || nowNum == num.length){
			return false;
		}
		if (solve(num, quest, nowNum+1) || solve(num, quest - num[nowNum], nowNum+1)) {
            return true;
        }
		return false;
	}

}