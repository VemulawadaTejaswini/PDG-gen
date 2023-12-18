import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String tmp = br.readLine();
//
//
//			if(tmp == null){
//				break;
//			}

			int[] input = new int[4];
			String[] tmpArray = tmp.split(" ");
			for(int i = 0; i < 4; i++){
				input[i] = Integer.parseInt(tmpArray[i]);
			}

			if(input[0] == 0 && input[1] == 0 && input[2] == 0 && input[3] == 0){
				break;
			}

			String result = makeExpression(input, 10);

			//2??????????????????????????????????????§??????
			for(int i = 0; i < 4; i++){
				for(int j = i + 1; j < 4; j++){
					int[] tmpIntArray = makeNewArray(input, i, j);
					//??????
					String tmpResult = makeExpression(tmpIntArray, 10 - input[i]*input[j]);
					if(tmpResult != null){
						result = "(("+ input[i] + " * " + input[j] + ") + " + tmpResult+")";
						break;
					}
					//??????1
					tmpResult = makeExpression(tmpIntArray, input[i]*input[j] - 10);
					if(tmpResult != null){
						result = "(("+input[i] + " * " + input[j] + ") - " + tmpResult+")";
						break;
					}
					//??????2
					tmpResult = makeExpression(tmpIntArray, 10 + input[i]*input[j]);
					if(tmpResult != null){
						result = "("+tmpResult + " - ("+ input[i] + " * " + input[j]+"))";
						break;
					}
					//??????
					if(10%(input[i]*input[j]) == 0){
						tmpResult = makeExpression(tmpIntArray, 10 / input[i]*input[j]);
						if(tmpResult != null){
							result = "("+tmpResult + " * ("+ input[i] + " * " + input[j]+"))";
							break;
						}
					}
				}
				if(result != null){
					break;
				}
			}

			//2??????????¶???????????????????????????§??????
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 4; j++){
					if(i == j){
						continue;
					}
					int[] tmpIntArray = makeNewArray(input, i, j);
					//??????
					String tmpResult = makeExpression(tmpIntArray, 10 - (input[i]+input[j]));
					//System.out.println("i = "+i+"j = "+j + tmpResult +" "+tmpIntArray[0]+" "+tmpIntArray[1]);
					if(tmpResult != null){
						result = "(("+ input[i] + " + " + input[j] + ") + " + tmpResult+")";
						break;
					}
					//??????1
					tmpResult = makeExpression(tmpIntArray, input[i]+input[j] - 10);
					if(tmpResult != null){
						result = "(("+input[i] + " + " + input[j] + ") - " + tmpResult+")";
						break;
					}
					//??????2
					tmpResult = makeExpression(tmpIntArray, 10 + input[i]+input[j]);
					if(tmpResult != null){
						result = "("+tmpResult + " - ("+ input[i] + " + " + input[j]+"))";
						break;
					}
					//??????
					if(10 % (input[i] + input[j]) == 0){
						tmpResult = makeExpression(tmpIntArray, 10 / ( input[i]+input[j]));
						if(tmpResult != null){
							result = ""+tmpResult + " * ("+ input[i] + " + " + input[j]+")";
							break;
						}
					}
				}
				if(result != null){
					break;
				}
			}

			if(result != null){
				System.out.println(result);
			}
			else {
				System.out.println(0);
			}
		}
	}

	static String makeExpression(int[] array, int num){
		String result = null;
		if(array.length == 1 ){
			if( array[0] == num){
				return String.valueOf(array[0]);
			}
			else {
				return null;
			}
		}
//
//		if(array.length == 2){
//			System.out.printf("a[0] %d a[1] %d make %d\n", array[0], array[1], num);
//		}

		for(int i = 0; i < array.length ; i++){
			int[] tmpNewArray = makeNewArray(array, i);
			//?????????????????§
			result = makeExpression(tmpNewArray, num - array[i]);
			if(result != null){
				result = "("+array[i]+" + "+result+")";
				break;
			}
			//?????????????????§1
			result = makeExpression(tmpNewArray, array[i] - num);
			if(result != null){
				if(result.length() == 1){
					result = array[i]+" - "+result;
				}
				else {
					result = array[i]+" - "+result+"";
				}
				result = "("+result+")";

				break;
			}
			//?????????????????§2
			result = makeExpression(tmpNewArray, array[i] + num);
			if(result != null){
				result = "("+result + " - " + array[i]+")";
				break;
			}
			//?????????????????§
			if(array[i] != 0 && num%array[i] == 0){
				result = makeExpression(tmpNewArray, num/array[i]);
				if(result != null){
					if(result.length() == 1){
						result = result + " * " + array[i];
					}
					else{
						result = result + " * " + array[i];
					}
					result = "("+result+")";
					break;
				}
			}
//			//?????????????????§1
//			if(num != 0 && array[i]%num == 0){
//				result = makeExpression(tmpNewArray, array[i]/num);
//				if(result != null){
//					result = array[i]+" / ("+result+")";
//					break;
//				}
//			}
//			//?????????????????§2
//			if(array[i] != 0){
//				result = makeExpression(tmpNewArray, array[i]*num);
//				if(result != null){
//					result = "("+result + ") /" + array[i];
//				}
//			}
		}

		//??????2?????\????????????????????????????????§???????????????????????????
		//?????¨???????????¢???????????§??????????????????????????????????????????

		return result;
	}

	static int[] makeNewArray(int[] array, int delete){
		int[] newArray = new int[array.length - 1];
		int j = 0;
		for(int i = 0; i < array.length ; i++){
			if(i != delete){
				newArray[j] = array[i];
				j++;
			}
		}

		return newArray;
	}

	static int[] makeNewArray(int[] array, int delete1, int delete2){
		int[] newArray = new int[array.length - 2];
		int j = 0;
		for(int i = 0; i < array.length ; i++){
			if(i != delete1 && i != delete2){
				newArray[j] = array[i];
				j++;
			}
		}

		return newArray;
	}

}