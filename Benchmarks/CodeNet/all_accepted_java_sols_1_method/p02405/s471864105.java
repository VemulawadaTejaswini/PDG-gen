import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int h = x.nextInt();
		int w = x.nextInt();
		StringBuilder sb1 = new StringBuilder();
		while(h != 0 || w != 0){
		for(int i = 1 ; i <= h ; i++){
			if(i%2 != 0){
				for(int n = 1 ; n <= w ; n++){
					if(n%2 != 0 ){
						sb1.append("#");
					}else{
						sb1.append(".");
					}
				}
			}
			if(i%2 == 0){
				for(int n = 1 ; n <= w ; n++){
				if(n%2 == 0 ){
					sb1.append("#");
				}else{
					sb1.append(".");
				}
				}
			}
			sb1.append("\n");
		}
		sb1.append("\n");
		h = x.nextInt();
		w = x.nextInt();
		}
		System.out.print(sb1);
	}

}