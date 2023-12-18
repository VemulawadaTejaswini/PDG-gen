import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			String[][] rule = new String[n][2];
			for(int i = 0;i < n;i++){
				for(int j = 0;j < 2;j++){
					rule[i][j] = scan.next();
				}
			}
			int m = scan.nextInt();
			boolean flag = false;
			for(int i = 0;i < m;i++){
				String str = scan.next();
				for(int j = 0;j < n;j++){
					if(str.equals(rule[j][0])){
						flag = true;
						System.out.print(rule[j][1]);
						break;
					}
				}
				if(flag){
					
				}else{
					System.out.print(str);
				}
				flag = false;
			}
			System.out.println();
			
		}
	}
}