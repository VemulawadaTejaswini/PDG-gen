import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for(int i=0;i<a;i++){
			char[] b=new char[51];
			String str=s.next();
			int right=25;
			int left=25;
			int now=25;
			b[25]=str.charAt(0);
			for(int j=0;j<str.length()/3;j++){
				if(str.charAt(j*3+1)=='-'){
					now++;
					if(now>right){
						b[now]=str.charAt(j*3+3);
						right++;
					}
				}else{
					now--;
					if(now<left){
						b[now]=str.charAt(j*3+3);
						left--;
					}
				}
			}
			for(int j=left;j<=right;j++)System.out.print(b[j]);
			System.out.println();
		}
	}
}