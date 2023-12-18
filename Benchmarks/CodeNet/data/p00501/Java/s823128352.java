import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String name=sc.next();
		char[] nameC=name.toCharArray();
		int namelen=name.length();
		int cnt=0;
		A:for(int i=0;i<n;i++){
			String str=sc.next();
			char[] strC=str.toCharArray();
			int strlen=str.length();
			boolean flag=false;
			int j=0;
			for(;j<strlen;j++){
				if(strC[j]==nameC[0]){
					int k=j;
					for(;k<strlen;k++){
						if(strC[k]==nameC[1]){
							int x=k-j;
							for(int l=k+x,m=2;l<strlen;l+=x,m++){
								flag=false;
								if(strC[l]==nameC[m]){
									flag=true;
									if(m==namelen-1){
										cnt++;
										System.out.println(i);
										continue A;
									}
								}
								if(flag==false){
									break;
								}
							}
						}
					}
				}
			}
		}
		System.out.println(cnt);
	}
}