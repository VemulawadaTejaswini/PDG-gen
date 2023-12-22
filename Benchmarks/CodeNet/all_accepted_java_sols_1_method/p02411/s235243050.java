import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		５０人以下のとき
		int a = 0;
	while(a<49){
//
//	m読み込み
		int m = sc.nextInt();
//
//	f読み込み
		int f = sc.nextInt();
//
//	r読み込み
		int r = sc.nextInt();
//
//	合計mf計算
		int mf = 0;
		
		if(m == -1){
			mf = f;
		}
		else if(f == -1){
			mf = m;
		}
		else{
			mf = m + f;
		}
		
		
//		m、f、r がすべて -1
			if(m==-1&&f==-1&&r==-1)break;//終了

//		mかfが-1ならF
			if((m!=-1&&f!=-1)&&80<=mf){
				System.out.println("A");
			}
			else if((m!=-1&&f!=-1)&&65<=mf){
				System.out.println("B");
			}
			else if((m!=-1&&f!=-1)&&50<=mf){
				System.out.println("C");
			}
			else if((m!=-1&&f!=-1)&&30<=mf){
				if(r<50){
					System.out.println("D");
				}
				else {
					System.out.println("C");
				}
			}
			else{
				System.out.println("F");
			}
			a++;
		}

	}

}

