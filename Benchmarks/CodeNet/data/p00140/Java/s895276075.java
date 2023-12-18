import java.util.Scanner;

public class Main {
	void run(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s,g;
		while(n--!=0){
			s=sc.nextInt();
			g=sc.nextInt();
			//s<gだったら数え上げ　s>g数え下げ
			if(0<=s && s<=5){
				if(s<g){
					boolean f=true;
					for(int i=s;i<=g;i++){
						if(f){
							System.out.print(i);
							f=false;
						}
						else{
							System.out.print(" "+i);
						}
					}
					System.out.println();
				}
				else{
					boolean f=true;
					for(int i=s;g<=i;i--){
						if(f){
							System.out.print(i);
							f=false;
						}
						else{
							System.out.print(" "+i);
						}
					}
					System.out.println();
				}
			}//

			if(6<=s && s<=9){
				if(s<g){
					boolean f=true;
					for(int i=s;i<=g;i++){
						if(f){
							System.out.print(i);
							f=false;;
						}
						else{
							System.out.print(" "+i);
						}
					}
					System.out.println();
				}
				else{
					boolean f=true;
					for(int i=s;i<=9;i++){
						if(f){
							System.out.print(i);
							f=false;;
						}
						else{
							System.out.print(" "+i);
						}
					}
					for(int i=5;0<=i;i--){
						if(f){
							System.out.print(i);
							f=false;;
						}
						else{
							System.out.print(" "+i);
						}
						if(i==g) break;
					}
					if(5<g){
						for(int i=1;i<=g;i++){
							if(f){
								System.out.print(i);
								f=false;;
							}
							else{
								System.out.print(" "+i);							}
						}
					}
					System.out.println();
				}//else
			}
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}