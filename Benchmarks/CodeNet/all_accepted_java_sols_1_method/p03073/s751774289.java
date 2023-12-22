import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		String[] Array = s.split("");
		int[]intArray=new int[Array.length];
		int count=0;
		
		for (int i=0;i<Array.length;i++) {
		intArray[i]=Integer.parseInt(Array[i]);
		}
		for(int i=0;i<intArray.length-1;i++) {
			if(intArray[i]==intArray[i+1]) {
				if(intArray[i+1]==0) {
					intArray[i+1]=1;
					count++;
				}else {
					intArray[i+1]=0;
					count++;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}

}