import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int[] str = new int[n];
			for(int i = 0;i < n;i++){
				str[i] = scan.nextInt();
			}
			Arrays.sort(str);
			int[] a = new int[3];
			int count = 0;
			int t = 0;
			for(int i = 0;i < n/2+1;i++){
				for(int j = 0;j < str.length;j++){
					if(i == j){
						continue;
					}
					t = Integer.parseInt(str[i] + "" + str[j]);
					if(count < 3){
						a[count] = t;
						count++;
					}else{
						if(count == 3){
							Arrays.sort(a);
							count++;
						}
						if(a[2] > t){
							if(a[1] > t){
								a[2] = a[1];
								if(a[0] > t){
									a[1] = a[0];
									a[0] = t;
								}else{
									a[1] = t;
								}
							}else{
								a[2] = t;
							}
						}
					}
				}
			}
			System.out.println(a[2]);
		}
	}
}