import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int l = sc.nextInt();
		while(a != 0 || l != 0){
			String[] list = new String[21];
			list[0] = zeroPad(Integer.toString(a), l);
			for(int i = 1; i <= 20; i++){
				int max = Integer.parseInt(getMax(list[i - 1]));
				int min = Integer.parseInt(getMin(list[i - 1]));
				list[i] = zeroPad(String.valueOf(max - min), l);
//				System.out.println(max +"-"+ min +"="+ list[i]);

				boolean flg = false;
				for(int j = 0; j < i; j++){
					if(list[i].equals(list[j])){
						System.out.println(j + " " + Integer.parseInt(list[i]) + " " + (i - j));
						flg = true;
						break;
					}
				}
				if(flg){
					break;
				}
			}
			a = sc.nextInt();
			l = sc.nextInt();
		}
		
		sc.close();
	}
	static String zeroPad(String str, int length){
		String res = str;
		while(res.length() < length){
			res = "0" + res;
		}
		return res;
	}
	static String getMax(String str){
		char[] res = str.toCharArray();
		
		for(int i = 1; i < res.length; i++){
			char tmp = res[i];
			int cmpi = Character.getNumericValue(tmp);
			for(int j = i; j > 0; j--){
				int cmpj = Character.getNumericValue(res[j - 1]);
				if(cmpj > cmpi){
					res[j] = tmp;
					break;
				}
				res[j] = res[j - 1];
				res[j - 1] = tmp;
			}
		}
		
		return String.valueOf(res);
	}
	static String getMin(String str){
		char[] res = str.toCharArray();
		
		for(int i = 1; i < res.length; i++){
			char tmp = res[i];
			int cmpi = Character.getNumericValue(tmp);
			for(int j = i; j > 0; j--){
				int cmpj = Character.getNumericValue(res[j - 1]);
				if(cmpj < cmpi){
					res[j] = tmp;
					break;
				}
				res[j] = res[j - 1];
				res[j - 1] = tmp;
			}
		}
		
		return String.valueOf(res);
	}
}