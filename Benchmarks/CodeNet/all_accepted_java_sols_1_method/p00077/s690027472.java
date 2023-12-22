import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str[]=new String[10000];
		int i=0,c=0,j;
		while(sc.hasNext()){
			str[c]=sc.next();
			c++;
		}
		
		for(i=0;i<c;i++){
			char ch[]=str[i].toCharArray();
			int lng=str[i].length()-1;
			for(j=0;;j++){
				if(ch[j]=='@'){
					j++;
					int k=ch[j]-'0';
					j++;
					for(int l=0;l<k;l++){
						System.out.print(ch[j]);
					}
				}
				else{
					System.out.print(ch[j]);
				}
				if(j==lng) break;
			}
			System.out.println();
		}
	}
}