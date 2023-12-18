import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // 入力
		int n = sc.nextInt();
		String str = sc.next();
		char[] a= str.toCharArray(); 
		String[] m = new String[n];
		for(int i=0;i<n;i++){
			m[i]=sc.next();
		}
		
		int rcd[][]= new int[n][25];
		for(int i=0;i<n;i++){
			for(int k=0;k<str.length();k++){
				for(int j=0;j<m[i].length();j++){
					if(a[k]==m[i].charAt(j)){
						rcd[i][j]=k+1;
					}
				}
			}
		}
		int c=0;
		int sum;
		for(int i=0;i<n;i++){
			for(int j=0;j<m[i].length();j++){
				if(rcd[i][j]==1){
					outside:for(int o=1;o<m[i].length()-j;o++){	
						for(int k=2;k<=str.length();k++){

							if(rcd[i][j+o]==k){
								do sum=o;while(false);
								o+=sum;
							}else{
								continue outside;
							}
							if(k==str.length()){
								c++;
								break outside;
							}
						}
					}
				}
			}
		}
		System.out.println(c);
		
		
	}
}