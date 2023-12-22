import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String str=sc.nextLine();
			char[] cPlaintext=str.toCharArray();
			String str1="abcdefghijklmnopqrstuvwxyz";
			char[] c1=str1.toCharArray();
			String str2="abcdefghijklmnopqrstuvwxyz";
			char[] c2=str2.toCharArray();
			char[] c3=new char[str.length()];
			boolean flag=false;
			while(true){
				for(int i=0;i<cPlaintext.length;i++){
					for(int j=0;j<c1.length;j++){
						if(cPlaintext[i]==c1[j]){
							c3[i]=c2[j];
							break;
						}else if(j==c1.length-1){
							c3[i]=cPlaintext[i];
						}
					}
				}
				for(int i=0;i<c3.length-3;i++){
					if(Character.toString(c3[i]).equals("t")&&Character.toString(c3[i+1]).equals("h")&&Character.toString(c3[i+2]).equals("e")){
						for(int j=0;j<c3.length;j++){
							System.out.print(c3[j]);
						}
						flag=true;
						break;
					}else if(i<c3.length-4&&Character.toString(c3[i]).equals("t")&&Character.toString(c3[i+1]).equals("h")){
						if(Character.toString(c3[i+2]).equals("i")&&Character.toString(c3[i+3]).equals("s")||Character.toString(c3[i+2]).equals("a")&&Character.toString(c3[i+3]).equals("t")){
							for(int j=0;j<c3.length;j++){
								System.out.print(c3[j]);
							}
							flag=true;
							break;
						}
					}
				}
				if(flag){
					System.out.println();
					break;
				}else{
					char box=c2[c2.length-1];
					for(int i=c2.length-1;i>0;i--){
						c2[i]=c2[i-1];
					}
					c2[0]=box;
				}
			}
		}
	}
}