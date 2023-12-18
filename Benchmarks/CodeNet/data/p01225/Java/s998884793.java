import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = 0;
		while(true){
			int[] num = new int[9];
			int[] colour = new int[9];
			int set = 0;
			int wl = 0;
			for(int i = 0;i < 9;i++){
				num[i] = sc.nextInt();
			}
			for(int i = 0;i < 9;i++){
				colour[i] = sc.next().charAt(0);
			}
			for(int i = 0;i < num.length-2;i++){
				if(num[i] == 10) continue;
				int x = num[i];
				int y = colour[i];
				for(int j = i+1;j < num.length-1;i++){
					if(num[j] == x && colour[j] == y){
						for(int k = j+1;k < num.length;k++){
							if(num[k] == x && colour[k] == y){
								set++;
								num[j] = 10;
								num[k] = 10;
							}
						}
					}

				}
				for(int j = i+1;j < num.length-1;i++){
					if(num[j] == x+1 && colour[j] == y){
						for(int k = j+1;k < num.length;i++){
							if(num[j] == x+2 && colour[j] == y){
								set++;
								num[j] = 10;
								num[k] = 10;
							}
						}
					}
					
				}
			}
			if(set == 3) wl = 1;
			System.out.println(wl);
			c++;
			if(c == n) break;
		}
	}
}