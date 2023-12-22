import java.util.*;

class Main{
	int a;
	int b;
	public Main(){
		Scanner scan = new Scanner(System.in);
		for(;;){
			a=scan.nextInt();
			b=scan.nextInt();
			if(a==0 || b==0)break;
			for(int i=0; i<a; i++){
				if(i%2==1){
					for(int j=0; j<b; j++){
						if(j%2==1){
							System.out.print("#");
							}else{
								System.out.print(".");
							}
					}
				}else{
					for(int k=0; k<b; k++){
						if(k%2==1){
							System.out.print(".");
						}else{
							System.out.print("#");
						}
					}
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
	public static void main(String[]args){
		new Main();
	}
}