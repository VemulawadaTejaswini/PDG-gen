import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int[] a = new int[3];
			int[] b = new int[3];
			int h;
			int m;
			int min;
			int t = 0;
			for(int i = 0;i < n;i++){
				String[] str = scan.next().split(":");
				h = Integer.parseInt(str[0]);
				m = Integer.parseInt(str[1]);
				min = scan.nextInt();
				min = (min > m)?min-m:min-m+60;
				if(h >= 11 && h <= 14){
					t = 0;
				}else if(h >= 18 && h <= 20){
					t = 1;
				}else if(h >= 21 || h <= 1){
					t = 2;
				}else{
					continue;
				}
				if(min <= 8){
					b[t]++;
				}
				a[t]++;
			}
			System.out.println("lunch " + ((a[0] == 0)?"no guest":(int)(100*(double)b[0]/a[0])));
			System.out.println("dinner " + ((a[1] == 0)?"no guest":(int)(100*(double)b[1]/a[1])));
			System.out.println("midnight " + ((a[2] == 0)?"no guest":(int)(100*(double)b[2]/a[2])));
		}
	}
}