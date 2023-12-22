import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			int[] counter = new int[26];
			String str = "";
			while(scan.hasNext())
			str = str + scan.nextLine();
			String[] str2 = str.toLowerCase().split("[^a-z]");
			for(int i = 0; i < str2.length;i++){
				for(int j = 0 ; j < str2[i].length();j++){
					int num = (int)str2[i].charAt(j) - (int)'a';
					counter[num] ++;
				}
			}
			for(int i = 0 ; i < counter.length;i++){
				System.out.println((char)((int)'a'+ i)+" : "+counter[i]);
			}
		}finally{
			if(scan!=null)scan.close();
		}
	}
}