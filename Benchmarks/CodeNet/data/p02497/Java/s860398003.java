import java.util.Scanner;

public class Main {

	static String[] mark=new String[]{"S","H","C","D"};
	static boolean[][] card=new boolean[4][13];

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(s.hasNext()){
			String[] num=s.nextLine().split(" ");
			int m=Integer.parseInt(num[0]);
			int f=Integer.parseInt(num[1]);
			int r=Integer.parseInt(num[2]);
			if(m==-1&&f==-1&&r==-1)break;
			System.out.println(ans(m,f,r));
		}
	}

	static String ans(int m,int f,int r){
		if(m==-1||f==-1) return "F";

		int scoer=m+f;

		if(80<=scoer){
			return "A";
		}else if(65<=scoer){
			return "B";
		}else if(50<=scoer){
			return "C";
		}else if(30<=scoer){
			if(50<=r){
				return "C";
			}else{
				return "D";
			}
		}else{
			return "F";
		}
	}
}