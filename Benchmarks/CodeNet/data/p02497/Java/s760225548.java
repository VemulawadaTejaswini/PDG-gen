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
		if(m<=50 &&f<=50 &&r<=100){
			if(m==0 || f==0 ||m+f<30){
				System.out.printf("F");
			}
			if(m+f>=80){
				System.out.printf("A");
			}
			if(m+f>=65 & m+f<80){
				System.out.printf("B");
			}	
			if(m+f>=50 & m+f<65){
				System.out.printf("C");
			}		
			if(m+f>=30 & m+f<50){
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