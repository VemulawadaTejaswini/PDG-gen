import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
	static Scanner sc=new Scanner(System.in);
	static PrintWriter pr=new PrintWriter(System.out);
	public static void main(String[] args) {
		char a[]=sc.next().toCharArray();
		for(int i=0;i<a.length;i++){
			if(a[i]=='@'){
				for(int j=0;j<a[i+1]-'0';j++){
					pr.print(a[i+2]);
					
				}
				i+=2;
			}else {
				pr.print(a[i]);
			}
		}
		pr.flush();
	}
}