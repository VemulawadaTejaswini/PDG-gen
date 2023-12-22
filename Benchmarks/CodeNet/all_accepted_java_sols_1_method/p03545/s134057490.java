import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc=new Scanner(System.in);
		String suu=sc.next();
		String[] array=suu.split("");
		int[] fainalValue=new int[array.length];
		
		for(int i=0;i<array.length;i++) {
			fainalValue[i]=Integer.parseInt(array[i]);
		}
		int A=fainalValue[0];
		int B=fainalValue[1];
		int C=fainalValue[2];
		int D=fainalValue[3];
		
		
		if((A+B+C+D)==7) {
			System.out.println(A+"+"+B+"+"+C+"+"+D+"=7");
		}else if((A-B+C+D)==7) {
			System.out.println(A+"-"+B+"+"+C+"+"+D+"=7");
		}else if((A+B-C+D)==7) {
			System.out.println(A+"+"+B+"-"+C+"+"+D+"=7");
		}else if((A+B+C-D)==7){
			System.out.println(A+"+"+B+"+"+C+"-"+D+"=7");
		}else if((A-B-C+D)==7){
			System.out.println(A+"-"+B+"-"+C+"+"+D+"=7");
		}else if((A+B-C-D)==7){
			System.out.println(A+"+"+B+"-"+C+"-"+D+"=7");
		}else if((A-B+C-D)==7){
			System.out.println(A+"-"+B+"+"+C+"-"+D+"=7");
		}else if((A-B-C-D)==7){
			System.out.println(A+"-"+B+"-"+C+"-"+D+"=7");
		}
	}

}
