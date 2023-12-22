import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		//File fi=new File("file.txt");

		Scanner sc=new Scanner(System.in);
		for(;;){
			int n=sc.nextInt();
			int x=sc.nextInt();
			
			if(n==0&&x==0)break;
			else{int count=0;
				for(int a=1;a<n;a++){
					for(int b=a+1;b<n;b++){
						for(int c=b+1;c<=n;c++){
							if(a+b+c==x){
								if(a!=b&&a!=c&&b!=c)count++;
								
						}
					}
					}
				}System.out.println(count);
				
			}
		}
		sc.close();
		
	
	}}