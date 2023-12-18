import java.util.Scanner;
public class Main{
	public static void main(String[] args){
			try(Scanner sc = new Scanner(System.in)){
				while(true){
				int num = sc.nextInt();
				int[] fuda = new int[num];
				for(int i=0; i<fuda.length; i++){
					fuda[i] = num-i;
				}
				int times = sc.nextInt();
				if(num==0 && times==0){
					sc.close();
					return;
				}
				for(int i=0; i<times; i++){
					int p = sc.nextInt();
					int c = sc.nextInt();
					int[] fuda_p = new int[p-1];
					int[] fuda_c = new int[c];
					for(int j=0; j<p-1; j++){
						fuda_p[j] = fuda[j];
					}
					for(int j=0; j<c; j++){
						fuda_c[j] = fuda[j+p-1];
					}
					for(int j=0; j<c; j++){
						fuda[j] = fuda_c[j];
					}
					for(int j=c; j<c+p-1; j++){
						fuda[j] = fuda_p[j-c];
					}
				}
				System.out.println(fuda[0]);
				}
		}
	}
}
