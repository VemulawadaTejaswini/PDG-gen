import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String s;
		Scanner scan = new Scanner(System.in);
		int[] c = new int[26];
		for(int i=0;i<c.length;i++){
			c[i]=0;
		}
		
		while(scan.hasNext()){
			s=scan.nextLine();
			char[] temp = s.toCharArray();
			for(int i=0;i<temp.length;i++){
				if(temp[i]>=65&&temp[i]<=90){
					c[temp[i]-65]+=1;
				}
				else if(temp[i]>=97&&temp[i]<=122){
					c[temp[i]-97]+=1;
				}
			}
		}
		scan.close();
		
		for(int i=0;i<c.length;i++){
			System.out.println((char)('a'+i)+" : " + c[i]);
		}
	}
}
