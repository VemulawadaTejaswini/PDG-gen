import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException {
				
		Scanner sc = new Scanner(System.in);
         
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            
            int tmp=0;
            if(a>b){tmp=a;a=b;b=tmp;
            }int count=0;
            for(int i=a;i<=b;i++){
            	
            	if(c%i==0) count++;
            }System.out.println(count);
	}
        }