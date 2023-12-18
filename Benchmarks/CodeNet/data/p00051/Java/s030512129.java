import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=0;i<n;i++){
			String str = new String();
			str = scan.next();
			char[] num = str.toCharArray();
			char[] max = new char[str.length()];
			char[] min = new char[str.length()];
			int index = 0;
			
			
			for(int j=57;j>=48;j--){
				for(int k=0;k<str.length();k++){
					if(num[k] == j){
						max[index] = num[k];
						index++;
					}
				}
			}
			
			index = 0;
			for(int j=48;j<=57;j++){
				for(int k=0;k<str.length();k++){
					if(num[k] == (char)j){
						min[index] = num[k];
						index++;
					}
				}
			}
			
			String maxStr = String.valueOf(max);
			String minStr = String.valueOf(min);
			int maxNum = Integer.parseInt(maxStr);
			int minNum = Integer.parseInt(minStr);
			
			System.out.println((maxNum-minNum));
		}
	}
}