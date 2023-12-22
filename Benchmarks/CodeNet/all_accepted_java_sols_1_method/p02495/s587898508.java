import java.util.Scanner;
class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int h,w;
		boolean hf,wf;
		while(true){
			hf = true;
			wf = true;
			h = scan.nextInt();
			w = scan.nextInt();
			if(h==0 && w==0)
				break;
			for(int i=0;i<h;i++){
				hf = wf;
				for(int j=0;j<w;j++){
					if(hf){
						System.out.print("#");
						hf = false;
					}else{
						System.out.print(".");
						hf = true;
					}
				}
				System.out.println("");
				if(wf){
					wf = false;
				}else{
					wf = true;
				}
			}
			System.out.println("");
		}
		scan.close();
	}
}