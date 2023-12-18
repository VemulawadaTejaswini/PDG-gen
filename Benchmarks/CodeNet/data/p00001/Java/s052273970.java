import java.util.Scanner;
public class Volume1 {
	public static void main(String[] args) {
		int[] takasa;
		takasa = new int[10];
		Scanner n=new Scanner(System.in);
			for (int i = 0; i < 10;i++){
				takasa[i]=n.nextInt();
		}
		int max=0;
		int max2=0;
		int max3=0;
		for (int a = 0; a < 10; a++){
			if (max < takasa[a]){ max=takasa[a];
			}
		}//ループ終了
			for (int b = 0; b < 10; b++){
			 if (max2 < takasa[b] && takasa[b] < max){ max2=takasa[b];
			}
		}//ループ終了
			 for (int c = 0; c < 10; c++){
			 if (max3 < takasa[c] && takasa[c] < max2){ max3=takasa[c];
			}
		}//ループ終了
		System.out.println(max);
		System.out.println(max2);
		System.out.println(max3);
	}	