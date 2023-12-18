
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int n[]=new int[10];
	static boolean count[]=new boolean[10];
	static boolean f;

	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		Scanner sc=new Scanner(System.in);
		String str;
		int i;
		while(sc.hasNext()){
			str=sc.next();
			in(str);
			//						for(i=0;i<10;i++){
			//						System.out.print(" "+n[i]);
			//						}

			for(i=1;i<10;i++){
				n[i]++;
				f=false;
				if(n[i]>4){

				}
				else if(dfs()){
					count[i]=true;
				}
				n[i]--;
			}

			for(i=0;i<10;i++){
				if(count[i]) break;
			}
			if(i==10){
				System.out.println("0");
			}
			else{
				boolean p=true;;
				for(i=1;i<10;i++){
					if(count[i]){
						if(p){
							System.out.print(i);
							p=false;
						}
						else{
							System.out.print(" "+i);
						}
					}
				}
				System.out.println();
			}
			Arrays.fill(count, false);
			Arrays.fill(n, 0);
		}
	}
	static void in(String str){
		for(int i=0;i<13;i++){
			int x=str.charAt(i)-'0';
			n[x]++;
		}
	}

	static boolean dfs(){
		int i;
		if(sum()==2 && check()){

			f=true;
		}
		for(i=1;i+2<10;i++){
			if(n[i]>0 && n[i+1]>0 && n[i+2]>0){
				n[i]--;
				n[i+1]--;
				n[i+2]--;
				dfs();
				n[i]++;
				n[i+1]++;
				n[i+2]++;
			}
		}
		for(i=1;i<10;i++){
			if(n[i]>2){
				n[i]=n[i]-3;
				dfs();
				n[i]=n[i]+3;
			}
		}
		return f;
	}

	static int sum(){
		int i,sum=0;
		for(i=0;i<10;i++){
			sum+=n[i];
		}
		return sum;
	}
	static boolean check(){
		for(int i=1;i<10;i++){
			if(n[i]>0){
				if(n[i]==2){
					return true;
				}
			}
		}
		return false;
	}
}