import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int count = 0;
			for(int i = 9;i >= 0;i--){
				if((n-i) > 27){
					break;
				}
				for(int j = 9;j >= 0;j--){
					if((n-i-j) > 18){
						break;
					}
					for(int k = 9;k >= 0;k--){
						if((n-i-j-k) > 9){
							break;
						}
						for(int l=9;l >= 0;l--){
							if(n-i-j-k == l){
								count++;
							}
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}