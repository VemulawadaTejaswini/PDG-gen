import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] c=str.toCharArray();
		String str1="abcdefghijklmnopqrstuvwxyz";
		char[] c1=str1.toCharArray();
		String str2="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] c2=str2.toCharArray();
		for(int i=0;i<c.length;i++){
			for(int j=0;j<c1.length;j++){
				if(c[i]==c1[j]){
					System.out.print(c2[j]);
					break;
				}else if(j==c1.length-1){
					System.out.print(c[i]);
				}
			}
		}
		System.out.println();
	}
}