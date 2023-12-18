import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str=sc.next();
		String[] str2=str.split(""); //一文字ずつ取り出す
		int x=Integer.parseInt(str2[0])*10+Integer.parseInt(str2[1]);

		int y=Integer.parseInt(str2[2])*10+Integer.parseInt(str2[3]);
		//xがMMの時
		if(0<x&&x<13){
			if(0<y&&y<13)System.out.println("AMBIGUOUS");
			else System.out.println("MMYY");
		}else{
			if(0<y&&y<13)System.out.println("YYMM");
			else System.out.println("NA");
		}
	}

}