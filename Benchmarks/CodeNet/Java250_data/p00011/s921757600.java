import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			int verLineNum = Integer.parseInt(br.readLine()); //tate
			int horLineNum = Integer.parseInt(br.readLine()); //yoko
			ArrayList<Integer[]> horLineList = new ArrayList<Integer[]>();
			for(int i=0;i<horLineNum;i++){
				String[] lineStr = br.readLine().split(",");
				Integer[] lineInfo = new Integer[2];
				for(int j=0;j<lineInfo.length;j++){
					lineInfo[j] = Integer.parseInt(lineStr[j]);
				}
				horLineList.add(lineInfo);
			}
			
			for(int i : SortGoalLine(verLineNum, horLineList)){
				System.out.println(i);
			}
		}
		catch(Exception e){
			return;
		}
		finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				return;
			}
		}
	}
	
	private static Integer[] SortGoalLine(int verLineNum,List<Integer[]> horizonLineList){
		Integer[] goalNum = new Integer[verLineNum];
		for(int i=0;i<goalNum.length;i++){
			goalNum[i] = i+1;
		}
		
		for(Integer[] i : horizonLineList){
			int temp = goalNum[i[0]-1];
			goalNum[i[0]-1] = goalNum[i[1]-1];
			goalNum[i[1]-1] = temp;
		}
		
		return goalNum;
	}

}