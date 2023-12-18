
import java.util.*;

public class Main {
	static char ch[][]=new char[9][9];
	static void check(int[][] bord){
		Set<Integer> s=new TreeSet<Integer>();
		//yoko
		for(int i=0;i<9;i++){
			s.clear();
			for(int j=0;j<9;j++){
				if(!s.add(bord[i][j])){
					//被りを見つけた時の処理
					for(int k=0;k<9;k++){
						if(bord[i][j]==bord[i][k]){
							ch[i][k]='*';
						}
					}
				}
			}
		}
		//tate
		for(int j=0;j<9;j++){
			s.clear();
			for(int i=0;i<9;i++){
				if(!s.add(bord[i][j])){
					//被りを見つけた時の処理
					for(int k=0;k<9;k++){
						if(bord[i][j]==bord[k][j]){
							ch[k][j]='*';
						}
					}
				}
			}
		}
		//3*3
		int l=3;
		for(int j=0;j<l;j+=3){
			s.clear();
			for(int i=0;i<l;i+=3){
				if(!s.add(bord[i][j])){
					//被りを見つけた時の処理
					for(int k=0;k<9;k++){
						if(bord[i][j]==bord[k][j]){
							ch[k][j]='*';
						}
					}
				}
			}
			if(l==9) break;
			l+=3;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int bord[][]=new int[9][9];
		while(n--!=0){
			for(int i=0;i<9;i++){
				for(int j=0;j<9;j++){
					bord[i][j]=sc.nextInt();
				}
			}
			for(int j=0;j<9;j++){
				Arrays.fill(ch[j],' ');
			}
			check(bord);
			for(int i=0;i<9;i++){
				for(int j=0;j<9;j++){
					System.out.print(ch[i][j]+""+bord[i][j]);
				}
				System.out.println();
			}
			if(n!=0) System.out.println();
		}
	}

}