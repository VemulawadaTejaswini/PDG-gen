import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] a=new int[4];int[] b=new int[4];
		while(sc.hasNext()){
			int hit=0,blow=0;
			//入力
			for(int i=0;i<4;i++){
			a[i]=sc.nextInt();
			}
			for(int i=0;i<4;i++){
				b[i]=sc.nextInt();
			}
			
			for(int i=0;i<4;i++){
				if(a[i]==b[i]){	//hit判定
					hit++;
					continue;	//hit判定された場合blow判定はしない
				}
				if(Arrays.asList(a).contains(b[i])){	//blow判定
					blow++;
				}
			}
			System.out.println(hit+" "+blow);
		}
		sc.close();
	}
}