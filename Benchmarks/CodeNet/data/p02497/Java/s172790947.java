import java.util.Scanner;
public class Main {
public static void main(String[] gras){
	Scanner sc = new Scanner(System.in);
	for(int i=0;;i++){
		int m=sc.nextInt();
		int f=sc.nextInt();
		int r=sc.nextInt();
		if(m==-1 && f==-1 && r==-1){
			break;
		}
		else if(m<=50 && f<=50 && r<=100){
			if(m==0 || f==0 || m+f<30){
				System.out.printf("F");
			}
			else if(m+f>=80)System.out.printf("A");
			else if(m+f>=65)System.out.printf("B");
			else if(m+f>=50)System.out.printf("C");
			else if(m+f>=30 & m+f<50){
				if(r>=50){
					System.out.printf("C");	
				}else{
				System.out.printf("D");
			}				
		}
	}
		System.out.printf("\n");
      }
   }
}