import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String str = sc.next();
		// スペース区切りの整数の入力
		
		String aa = str.substring(0,1);
		String cc = str.substring(2);
		cc =cc.substring(0, cc.length() -1);
		int indA = str.indexOf("A");
		int indC = str.indexOf("C");
		int lastIndA = str.lastIndexOf("A");
		int lastIndC = str.lastIndexOf("C");

		// System.out.println(indA);
		// System.out.println(indC);
		// System.out.println(lastIndA);
		// System.out.println(lastIndC);
		// 		System.out.println(indA==1);
		// System.out.println(cc.contains("C"));
		// System.out.println(lastIndA==indA);
		// System.out.println(lastIndC==indC);
		if(indA==0&&cc.contains("C")&&(lastIndA==indA)&&lastIndC==indC){
			boolean flag =false;
			String lowerStr=str.replace("A","a");
			lowerStr= lowerStr.replace("C","c");
			flag = isLower(lowerStr);
			// System.out.println(lowerStr);
			if(flag){
				System.out.println("AC");
			}else{
				System.out.println("WA");
			}
		}else{
			System.out.println("WA");
		}
	}

	public static boolean isLower(String str) {
		return str.equals(str.toLowerCase());
	}

}