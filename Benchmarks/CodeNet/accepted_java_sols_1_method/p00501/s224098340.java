import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String name = sc.next();
		int nl = name.length();
		int cnt=0;
		
		for(int i0=0; i0<N; ++i0){//N個の看板
//			System.out.println(i0);
			String old =sc.next();
			int ol = old.length();
			boolean flg=false;
			for(int i1=0; (nl-1)*i1+nl<=ol; ++i1){//文字の間隔
				for(int i2=0; i2<=ol-((nl-1)*i1+nl); ++i2){//一文字目のサーチ
					int check=0;
					for(int i3=0; i3<nl; ++i3){//チェック
//						System.out.println(i3+" "+(i2+i3*i1+i3));
						if(name.charAt(i3)==old.charAt(i2+i3*i1+i3)){
							++check;
						}
						if(check==nl){
							flg=true;
							break;
						}
					}
					if(flg) break;
				}
				if(flg) break;
			}
			if(flg) ++cnt;
		}	
		System.out.println(cnt);
		
	}
}