import java.util.Scanner;
	public class Main{
		public static void main(String[]args){
			Scanner sc = new Scanner(System.in);
			int h;
			for(h=1;;h++){
				int x=sc.nextInt();
				int y=sc.nextInt();
				int i,j;
				if(x!=0&&y!=0){
					int m;
					for(m=0;m<y;m++){
						System.out.printf("#");
					}
					System.out.println("");
					for(i=0;i<x-2;i++){
						for(j=0;j<y;j++){
							if(j==0||j==y-1){
							System.out.printf("#");
						}else{
							System.out.printf(".");
						}
						}
						System.out.println("");
					}
					for(m=0;m<y;m++){
						System.out.printf("#");
					}
					System.out.println("");
					}else{
						break;
					}
			}
		}
	}