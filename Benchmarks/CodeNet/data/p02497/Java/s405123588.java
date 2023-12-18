import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(scan.hasNext()){
			int m=scan.nextInt();
			int f=scan.nextInt();
			int r=scan.nextInt();
			if(m==-1 && f==-1 && r==-1){
				break;
			}
			if(m==-1){
				System.out.println("F");
				continue;
			}
			if(m+f>=80){
				System.out.println("A");
			}else if(m+f<80 && m+f>=65){
				System.out.println("B");
			}else if(m+f<65 && m+f>=50){
				System.out.println("C");
			}else if(m+f<50 && m+f>=30){
				if(r>50){
					System.out.println("C");
				}else{
					System.out.println("D");
				}
			}else{
				System.out.println("F");
			}
			
		}
	}

}