import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int m = scan.nextInt() - 2*n;
			char[] ch = (scan.next()).toCharArray();
			int count = 0;
			for(int i = 0;i < m;i++){
				if(ch[i] == 'I'){
					for(int j = 1;j < 2*n+1;j+=2){
						if(ch[i+j] != 'O' || ch[i+j+1] != 'I'){
							break;
						}else if(j == 2*n-1){
							count++;
							i++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}