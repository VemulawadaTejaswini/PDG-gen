import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while(true){
		int count = 0;
		int count2 = 1;
		int h = sc.nextInt();
		int w = sc.nextInt();
		if(h==0 && w==0) break;
		for(int i=0; i<h; i++){
		for(int j=0; j<w; j++){
			if(count2==1 || count2==h){
				System.out.print("#");}
			else	if(count==1 || count==w){
		System.out.print("#");}
			else{System.out.print(".");}
			count+=1;
		}
		System.out.println(); 
		count2+=1;
		count = 1;
		
		
		 }
		System.out.println();
		}
         
        }
}