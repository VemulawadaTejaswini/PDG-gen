import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		//??\??????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //?????¢???
        String alphametic;
        //??????
        int result;
        //?¨?????????????????????¢??????????????\?????????
        while(true){
        	alphametic = br.readLine();
        	if(alphametic == null || alphametic.equals("")){
        		break;
        	}
        	//?¨???????????????????
        	if((result = solve(alphametic)) != -1){
        		System.out.println(result);
        	}else{
        		System.out.println("NA");
        	}
        }
	}
	
	private static int solve(String alphametic){
		List<String> dividedAlphametic = divide(alphametic);
		for(int i = 0 ; i < 10 ; i++){
			BigInteger  addAnswer = convertX(dividedAlphametic.get(0),i).add(convertX(dividedAlphametic.get(1),i));
			if(addAnswer.compareTo(convertX(dividedAlphametic.get(2),i)) == 0){
				return i;
			}
		}
		return -1;
	}
	
	private static BigInteger convertX(String alphametic,int num){
		String answerstr =alphametic.replace("X", String.valueOf(num));
		return new BigInteger(answerstr.replaceAll("^0+", ""));
	}
	

	private static List<String> divide(String alphametic){
		char[] alphameticChar = alphametic.toCharArray();
		List<String> dividedAlphametic = new ArrayList<String>();
		StringBuffer sb = new StringBuffer();
		for(int i = 0 ; i < alphameticChar.length ; i++){
			if(alphameticChar[i] != '+' && alphameticChar[i] != '='){
				sb.append(alphameticChar[i]);
			}else{
				dividedAlphametic.add(sb.toString());
				sb = new StringBuffer();
			}
		}
		dividedAlphametic.add(sb.toString());
		
		return dividedAlphametic;
	}

}