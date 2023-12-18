import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n;
		int roop=0;
		StringBuilder[] ans=new StringBuilder[1000];
		String tmpData;
		while((n=sc.nextInt())!=0){
			String[][] str=new String[n][2];
			for(int j=0;j<n;j++){	//変換表の入力
				str[j][0]=sc.next();
				str[j][1]=sc.next();
			}
			int dn=sc.nextInt();	//変換データ文字数
			for(int j=0;j<dn;j++){
				tmpData=sc.next();
				for(int k=0;k<n;k++){
					if(tmpData.equals(str[k][0])){
						tmpData=str[k][1];
						break;
					}
				}
				if(j==0){
					ans[roop]=new StringBuilder(tmpData);
				}else{
					ans[roop].append(tmpData);
				}
			}
			roop++;
		}
		sc.close();
		for(int i=0;i<roop;i++){
			System.out.println(ans[i].toString());
		}
	}
}