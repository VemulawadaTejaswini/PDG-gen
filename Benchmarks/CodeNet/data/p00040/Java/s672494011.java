import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int p = 0;
		sc.nextLine();
		for(int i=0;i<n;i++){
			String s = sc.nextLine();
			StringBuffer sb = new StringBuffer();
			for(int j=0;j<26;j++){
				if(j%2==1 && j!=13){
					for(int k=0;k<26;k++){
						for(int t=0;t<s.length();t++){
							p = s.codePointAt(t) - 97;
							if(p==-65){
								sb.append(" ");
							}else{
								sb.append((char)((j*p+k)%26+97));
							}
						}
						if(sb.indexOf("that")!=-1 || sb.indexOf("this")!=-1){
							System.out.println(sb);
							k=26;
							j=26;
						}else{
							sb.delete(0, s.length());
						}
					}
				}
			}
		}
		
	}	
}