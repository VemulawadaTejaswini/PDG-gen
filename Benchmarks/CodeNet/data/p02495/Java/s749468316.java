import java.util.Scanner;
class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int h,w;
		boolean f;
		while(true){
			f = true;
			h = scan.nextInt();
			w = scan.nextInt();
			if(h==0 && w==0)
				break;
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(f){
						System.out.print("#");
						f = false;
					}else{
						System.out.print(".");
						f = true;
					}
				}
				System.out.println("");
				if(f){
					f=false;
				}else{
					f=true;
				}
			}
			System.out.println("");
		}
		scan.close();
	}
}