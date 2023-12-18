import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int m = scan.nextInt();
			char[] ch = (scan.next()).toCharArray();
			int count = 0;
			for(int i = 0;i < m-2;i++){
				if(ch[i] == 'I'){
					for(int j = 1;j < 2*n+1;j++){
						if(j%2 == 0){
							if(ch[i+j] != 'I'){
								break;
							}
							if(j == 2*n){
								count++;
							}
						}else{
							if(ch[i+j] != 'O'){
								break;
							}
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}