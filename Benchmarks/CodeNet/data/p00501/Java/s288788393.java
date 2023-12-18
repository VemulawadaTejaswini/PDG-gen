import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		new Main().run();
	}
	void run(){
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int count = 0;
		char name[]=in.next().toCharArray();
		int cnt[] = new int [name.length];
		char yobi[][] = new char [k][];
		for(int i = 0;i < k;i++){
			yobi[i]=in.next().toCharArray();
		}
		for(int i = 0;i < k;i++){
			for(int j=0; j<yobi[i].length; j++){
				if(name[0]==yobi[i][j]){
					if(barname(name,yobi[i],j,0,cnt)){
						count++;
						break;
					}
				}
			}
		}
		System.out.println(count);
	}
	boolean barname(char name[],char yobi[],int j,int v,int cnt[]){
		cnt[v]=j;
		if(name.length-1 <= v){
			for(int k=0; k+2<name.length; k++){
				if(cnt[k+1]-cnt[k] != cnt[k+2]-cnt[k+1]){
					return false;
				}
			}
			return true;
		}
		for(int l=j+1; l<yobi.length; l++){
			if(name[v+1]==yobi[l]){
				if(barname(name, yobi, l, v+1, cnt)){
					return true;
				}
			}
		}
		return false;
	}
}