import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int n=sc.nextInt();//個数
				if(n==0) break;
				int nowlength=0;//level
				char[] e=new char[10];//演算子
				boolean[][] num=new boolean[14][400000000];//levelと数値
				while(n>=0) {
					String str="0";
					if(n>0) {
						str=sc.next();//読み込み
					}
					if(str.length()-1<nowlength || n==0) {
						int sum=0;

						for(int i=nowlength; i>str.length()-1; i--) {
							if(e[i]=='+') {
								sum=0;
								for(int j=0; j<400000000; j++) {
									if(num[i][j]) {
										sum+=j;
										num[i][j]=false;
									}
								}
							}
							else if(e[i]=='*') {
								sum=1; 
								for(int j=0; j<400000000; j++) {
									if(num[i][j]) {
										sum*=j;
										num[i][j]=false;
									}
								}
							}
							num[i-1][sum]=true;
						}
					}
					if(n>0) {
						for(int i=0; i<str.length(); i++) {
							if(str.charAt(i)=='+') {
								e[nowlength+1]='+';
							}
							else if(str.charAt(i)=='*') {
								e[nowlength+1]='*';
							}
							else if(str.charAt(i)=='.') {
								nowlength=str.length()-1;
							}
							else {
								num[nowlength][str.charAt(i)-'0']=true;
							}
						}
					}
					n--;
				}
				for(int i=0; i<400000000; i++) {
					if(num[0][i]) {
						System.out.println(i);
						break;
					}
				}
			}


		}
	}
}
