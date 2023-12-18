import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str;
		String lo = null;
		String[] h = new String[1000];
		int[] hi = new int[1000];
		int j = 0;
		int num = 0;
		String numSTR[] = new String[999];
		
		while(scan.hasNextInt()){
			str = scan.next();
			if(str.length() > lo.length())lo = str;
			
			for(int i = 0; i < 1000; i++){
				if(str.equals(h[i])){
					hi[j] ++;
					numSTR[j] = str;
					j++;
					
					break;
				}else if(h[i].equals(null)){
					h[i] = str;
					break;
				}
			}
		}
		for(int i = 0; i < j; i++){
			if(num < hi[i]){
				num = i;
			}else if(hi[i] == 0)break;
		}
		System.out.println(numSTR[num] + " " + lo);
	}
}