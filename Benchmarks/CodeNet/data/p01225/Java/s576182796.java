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
			int i;
			for(i = 0;i < 9;i++){
				num[i] = sc.nextInt();
			}
			for(i = 0;i < 9;i++){
				colour[i] = sc.next().charAt(0);
			}
			for(i = 0;i < 7;i++){
				if(num[i] == 10) continue;
				for(int j = i;j < 8;i++){
					if(colour[j] == colour[i] && num[j] == num[i]){
						for(int k = 0;k < 9;k++){
							if(colour[k] == colour[i] && num[k] == num[i]){
								set++;
								num[j] = 10;
								num[k] = 10;
							}
						}
					}

				}
				for(int j = i;j < 8;i++){
					if(colour[j] == colour[i] && num[j] == num[i]+1){
						for(int k = 0;k < 9;i++){
							if(colour[k] == colour[i] && num[k] == num[i]+2){
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