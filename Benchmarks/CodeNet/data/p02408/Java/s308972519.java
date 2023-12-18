import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

class Main{
	public static void main(String[] args) throws IOException{ 
		
		
		ArrayList<String> spadeList = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13"));
		ArrayList<String> hartList = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13"));
		ArrayList<String> clabList = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13"));
		ArrayList<String> diamondList = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13"));
		
		String[] cardType = new String[2];
		
		//?????£??????????????????????????°?????\???
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String strCards = br.readLine();
		int cardNum = Integer.parseInt(strCards);
		
		//?????£??????????????????????¨?????????\??? 
		
		for(int i=0 ; i<cardNum; i++){
			
			BufferedReader br2 =
					new BufferedReader(new InputStreamReader(System.in));
			
			cardType = br2.readLine().split(" ");
			if(cardType[0].equals("S")) {
				spadeList.remove(cardType[1]);
			}
			else if(cardType[0].equals("H")) {
				hartList.remove(cardType[1]);
			}
			else if(cardType[0].equals("C")) {
				clabList.remove(cardType[1]);
			}
			else if(cardType[0].equals("D")) {
				diamondList.remove(cardType[1]);
			}
		}
		
		for(int j=0; j<spadeList.size(); j++){
			 System.out.println("S "+ spadeList.get(j));
		}
		for(int j=0; j<hartList.size(); j++){
			 System.out.println("H "+ hartList.get(j));
		}
		for(int j=0; j<clabList.size(); j++){
			 System.out.println("C "+ clabList.get(j));
		}
		for(int j=0; j<diamondList.size(); j++){
			 System.out.println("D "+ diamondList.get(j));
		}
		
		
		
	}
}