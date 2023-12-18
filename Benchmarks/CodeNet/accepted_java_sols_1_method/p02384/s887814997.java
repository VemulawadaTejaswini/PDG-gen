import java.util.Scanner;

class Main
{
	public static void main(String[] args){
		
	int[] men = new int[7];
	int[] kari = new int[7];
	int[] ue = new int[30];
	int[] yoko = new int[30];
		
	Scanner scan = new Scanner(System.in);
	
	for(int i=1; i<=6; i++){
		men[i] = scan.nextInt();}
		
	int kai = scan.nextInt();
	
	for(int p=0; p<kai; p++){
		ue[p] = scan.nextInt();
		yoko[p] = scan.nextInt();}
		
	for(int p=0; p<kai; p++){
		for(int i=1; i<=6; i++){
			if(men[i]==ue[p]){
				if(i==2){
					kari[1] = men[1];		kari[2] = men[2];
					kari[5] = men[5];		kari[6] = men[6];
			
					men[1] = kari[2];		men[2] = kari[6];
					men[6] = kari[5];		men[5] = kari[1];
				}
				else if(i==3){
					kari[1] = men[1];		kari[3] = men[3];
					kari[4] = men[4];		kari[6] = men[6];
			
					men[1] = kari[3];		men[3] = kari[6];
					men[4] = kari[1];		men[6] = kari[4];
				}
				else if(i==4){
					kari[1] = men[1];		kari[3] = men[3];
					kari[4] = men[4];		kari[6] = men[6];
			
					men[1] = kari[4];		men[3] = kari[1];
					men[4] = kari[6];		men[6] = kari[3];
				}
				else if(i==5){
					kari[1] = men[1];		kari[2] = men[2];
					kari[5] = men[5];		kari[6] = men[6];
			
					men[1] = kari[5];		men[2] = kari[1];
					men[6] = kari[2];		men[5] = kari[6];
				}
				else if(i==6){
					kari[1] = men[1];		kari[2] = men[2];
					kari[5] = men[5];		kari[6] = men[6];
			
					men[1] = kari[2];		men[2] = kari[6];
					men[6] = kari[5];		men[5] = kari[1];
					
					kari[1] = men[1];		kari[2] = men[2];
					kari[5] = men[5];		kari[6] = men[6];
			
					men[1] = kari[2];		men[2] = kari[6];
					men[6] = kari[5];		men[5] = kari[1];
				}
			}
		}
		
		for(int q=0; q<4; q++){
			if(men[2]==yoko[p]){
				break;
			}
			
			kari[1] = men[1];		kari[2] = men[2];
			kari[5] = men[5];		kari[6] = men[6];
			
			men[1] = kari[2];		men[2] = kari[6];
			men[6] = kari[5];		men[5] = kari[1];
			
			kari[1] = men[1];		kari[3] = men[3];
			kari[4] = men[4];		kari[6] = men[6];
			
			men[1] = kari[4];		men[3] = kari[1];
			men[4] = kari[6];		men[6] = kari[3];
			
			kari[1] = men[1];		kari[2] = men[2];
			kari[5] = men[5];		kari[6] = men[6];
			
			men[1] = kari[5];		men[2] = kari[1];
			men[6] = kari[2];		men[5] = kari[6];
		}
		
		System.out.println(men[3]);
	}
	}
}
