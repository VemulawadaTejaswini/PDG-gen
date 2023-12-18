import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		int d3 = sc.nextInt();
		int d4 = sc.nextInt();
		int d5 = sc.nextInt();
		int d6 = sc.nextInt();
		int num = sc.nextInt();
		
		int ary1[] = {d1, d2, d6, d5, d1};
		int ary2[] = {d1, d3, d6, d4, d1};
		int ary3[] = {d2, d3, d5, d4, d2};
		
		int rd1 = 0;
		int rd2 = 0;
		for(int i=0; i<num; i++){
			rd1 = sc.nextInt();
			System.out.print("");
			rd2 = sc.nextInt();
			int ans = 0;
			for(int j=0; j<4; j++){
				if(rd1==ary1[j]&&rd2==ary1[j+1]){
					ans = d3;
				}else if(rd2==ary1[j]&&rd1==ary1[j+1]){
					ans = d4;
				}else if(rd1==ary2[j]&&rd2==ary2[j+1]){
					ans = d5;
				}else if(rd2==ary2[j]&&rd1==ary2[j+1]){
					ans = d2;
				}else if(rd1==ary3[j]&&rd2==ary3[j+1]){
					ans = d1;
				}else if(rd2==ary3[j]&&rd1==ary3[j+1]){
					ans = d6;
				}
			}
			System.out.println(ans);
		}
	}
}