import java.io.BufferedReader;
import java.io.InputStreamReader;

//©Èè¢B[vÉHvÌ]n è
//public class Problem0015_NationalBudget {
public class Main {
	public static void main(String[] args) {
		try {
		//	Problem0015_NationalBudget test = new Problem0015_NationalBudget();
			Main test = new Main();
			
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			int problemNumber = Integer.parseInt(reader.readLine());
			for(int i = 0; i < problemNumber; i++) {
				String origin = reader.readLine();
				String addition = reader.readLine();
				
				String result = test.getSum(origin, addition);
				if(result == null) {
					System.out.println("overflow");
				} else {
					System.out.println(result);
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	String getSum(String origin, String addition) {
		char[] originArray = origin.toCharArray();
		char[] additionArray = addition.toCharArray();
		
		char[] maxCharArray = (originArray.length < additionArray.length ? additionArray : originArray);
		char[] minCharArray = (originArray.length < additionArray.length ? originArray : additionArray);
		
		if(maxCharArray.length > 80) {	//overflow ÌÆ«Í null ðÔ·B
			return null;
		}
		
		int[] resultNumberArray = new int[maxCharArray.length + 1];	//ªPÂãªéÂ\«ª éB
		int position;
		for(position = 1; position < minCharArray.length +1; position++) {
			int originNumber = Integer.parseInt("" + maxCharArray[maxCharArray.length - position]);
			int additionNumber = Integer.parseInt("" +minCharArray[minCharArray.length - position]);
			int sum = originNumber + additionNumber;
		//	System.out.println(maxCharArray[maxCharArray.length - position] + " + " + minCharArray[minCharArray.length - position] + " = " + sum);
			if(sum < 10) {
				resultNumberArray[resultNumberArray.length-position] += sum;
			} else {	//0<= sum < 19 æèJèãªèª"1"­¶
				sum = sum - 10;
				resultNumberArray[resultNumberArray.length-position] += sum;
				resultNumberArray[resultNumberArray.length-position -1] += 1;
			}
		}
		for(; position < maxCharArray.length + 1; position++) {
			int maxCharNumber = Integer.parseInt("" + maxCharArray[position - position]);
			int sum = resultNumberArray[resultNumberArray.length-position] + maxCharNumber;
			
			if(sum < 10) {
				resultNumberArray[resultNumberArray.length-position] += sum;
			} else {
				sum = sum - 10;
				resultNumberArray[resultNumberArray.length-position] = sum;
				resultNumberArray[resultNumberArray.length-position -1] += 1;
			}
		}
	//	System.out.println(resultNumberArray.length + "\t" + resultNumberArray[0]);
		if(resultNumberArray.length > 81 ||(resultNumberArray.length == 81 && resultNumberArray[0] > 0)) {	//ªãªÁÄ80ð´¦½ê
			return null;
		}
		StringBuilder textBuilder = new StringBuilder();
		for(int number : resultNumberArray) {
			textBuilder.append(Integer.toString(number));
		}
		String result = textBuilder.toString();
		if(result.startsWith("0")) {
			result = result.substring(1);
		}
		return result;
	}
}