import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = 0;
		for(int i = 0; i < a + 1; i++){
			b = 0;
			for(int j = 1; j < 23;j++){
				for(int k = 1; k < 13;k++){
					for(int l = 1; l < 9;l++){
						if(j * j + j * k + k * k + k * l + l * l + l * j == i){
							b++;
						}
					}
				}
			}
			System.out.println(b);
		}
	}
}