import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();

		String[] sArray = s.split("");
		String[] tArray = t.split("");

		int num_times = sArray.length - tArray.length + 1;

		String part = new String();

		int count = 9999;

		for (int i = 0; i < num_times;i++){

			StringBuilder sb = new StringBuilder();

			for(int j=i; j < i + tArray.length; j++){
				sb.append(sArray[j]);
			}
			part = sb.toString();

			//System.out.println(part);

			String[] partArray = part.split("");
			int currentCount = 0; 

			for(int k = 0; k < tArray.length; k++){

				if(!partArray[k].equals(tArray[k])){
					//System.out.println("P:"+ partArray[k] +"  " + "T:" + tArray[k]);
					currentCount ++;
					//System.out.println(currentCount);
				}
			}

			count =  currentCount < count ? currentCount : count;  
			// if(currentCount < count){
			// 	count = currentCount;
			// }
			//System.out.println(count);		
		}
		System.out.println(count);
		sc.close();	
	}
}
