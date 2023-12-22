import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc =new Scanner(System.in);
		int n[]=new int[3];
		int t=0;
		int ans=0;
		for(int i=0;i<3;i++){
			n[i]=sc.nextInt();
		}
		for(int j=0;j<2;j++){
			for(int i=0;i<2-j;i++){
				if(n[i+1]-n[i]<0){
					t=n[i];
					n[i]=n[i+1];
					n[i+1]=t;
				}
			}
		}
		for(int i=0;i<2;i++){
			ans+=n[i+1]-n[i];
		}
		System.out.println(ans);
	}

}

