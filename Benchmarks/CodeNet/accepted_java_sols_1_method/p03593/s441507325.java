import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] a = new int[h][w];
		sc.nextLine();
		for(int i=0; i<h; i++){
			String s = sc.nextLine();
			for(int j=0; j<w; j++){
				a[i][j] = s.charAt(j) - 97;
			}
		}
		sc.close();
		int x1=0, x2=0, x4=0;
		
		int[] num = new int[26];
		Arrays.fill(num, 0);
		
		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){
				num[a[i][j]]++;
			}
		}
		
		for(int i=0; i<26; i++){
			if(num[i] % 4 == 0){
				x4++;
			}else if(num[i] % 2 == 0){
				x2++;
			}else{
				x1++;
			}
		}
		
		if(h%2 == 0 && w%2 == 0){
			if(x1>0 || x2 > 0){
				System.out.println("No");
			}else{
				System.out.println("Yes");
			}
		}else if(h%2 != 0 && w%2 != 0){
			if(x1 != 1 || x2 > (w-1+h-1)/2 || (x2 - (w-1+h-1)/2)%2 != 0){
				System.out.println("No");
			}else{
				System.out.println("Yes");
			}
		}else if(h%2 != 0 && w%2 == 0){
			if(x1>0 || x2 > w/2 || (x2-w/2)%2 != 0 ){
				System.out.println("No");
			}else{
				System.out.println("Yes");
			}
		}else{
			if(x1>0 || x2 > h/2 || (x2-h/2)%2 != 0 ){
				System.out.println("No");
			}else{
				System.out.println("Yes");
			}
		}
		
		
	}
}
