import java.util.Scanner;
//import java.lang.Math;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

       while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
			int c = sc.nextInt();
            int i, j;
 
            if(a==-1 && b==-1 && c==-1) break;
 
			if(a==-1 || b==-1){
				System.out.printf("F");
			}
			else if(a+b >= 80){
				System.out.printf("A");
			}
			else if(a+b >= 65){
				System.out.printf("B");
			}   
			else if(a+b >= 50){
				System.out.printf("C");
			}
			else if(a+b >= 30){
				if(c >= 50){
					System.out.printf("C");
				}
				else{
					System.out.printf("D");
				}
			}
			else{
				System.out.printf("F");
			}
			
			System.out.printf("\n");
		}
	}
}