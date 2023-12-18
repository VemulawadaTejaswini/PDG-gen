import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		String N=sc.nextLine();
		String ans="";
		char t[]=N.toCharArray();
		int T[]=new int[t.length];
		for(int i=0;i<t.length;i++){
			T[i]=Character.getNumericValue(t[i]);
		}		
		for(int i=0;i<t.length;i++){
			switch(T[i]){
			case 1:
				T[i]=9;
				break;
			case 9:
				T[i]=1;
				break;
			}
		}
		System.out.println(T[0]*100+T[1]*10+T[2]);
	}

}