import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] di = new int[7];
		
		for(int i = 1; i < 7; i++){
			di[i] = scan.nextInt();
		}
		
		int q = scan.nextInt();
		for(int i = 0; i < q; i++){
			int ue  = scan.nextInt();
			int mae = scan.nextInt();
		
			if((ue==di[1]&&mae==di[2])||(ue==di[2]&&mae==di[6])||(ue==di[6]&&mae==di[5])||(ue==di[5]&&mae==di[1])){
				System.out.println(di[3]);
			}
			if((ue==di[1]&&mae==di[5])||(ue==di[5]&&mae==di[6])||(ue==di[6]&&mae==di[2])||(ue==di[2]&&mae==di[1])){
				System.out.println(di[4]);
			}
			if((ue==di[1]&&mae==di[3])||(ue==di[3]&&mae==di[6])||(ue==di[6]&&mae==di[4])||(ue==di[4]&&mae==di[1])){
				System.out.println(di[5]);
			}
			if((ue==di[2]&&mae==di[4])||(ue==di[4]&&mae==di[5])||(ue==di[5]&&mae==di[3])||(ue==di[3]&&mae==di[2])){
				System.out.println(di[6]);
			}
			if((ue==di[2]&&mae==di[3])||(ue==di[3]&&mae==di[5])||(ue==di[5]&&mae==di[4])||(ue==di[4]&&mae==di[2])){
				System.out.println(di[1]);
			}
			if((ue==di[1]&&mae==di[4])||(ue==di[4]&&mae==di[6])||(ue==di[6]&&mae==di[3])||(ue==di[3]&&mae==di[1])){
				System.out.println(di[2]);
			}
		}
	}
}

