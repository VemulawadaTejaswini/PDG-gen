import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		

		Scanner sc=new Scanner(System.in);
		String suu=sc.next();
		String[] array=suu.split("");
		int[] colorArray=new int[array.length];
		int colorCangeCnt=0;
		
		for(int i=0;i<array.length;i++) {
			colorArray[i]=Integer.parseInt(array[i]);
		}
		
		for(int i=0;i<colorArray.length-1;i++) {
			if(colorArray[i]==colorArray[i+1]) {
				if(colorArray[i+1]==0) {
					colorArray[i+1]=1;
					colorCangeCnt++;
				}else {
					colorArray[i+1]=0;
					colorCangeCnt++;
				}
			}
		
		}

		System.out.println(colorCangeCnt);
	}

}
