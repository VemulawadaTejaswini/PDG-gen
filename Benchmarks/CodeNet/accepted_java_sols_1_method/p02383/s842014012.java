import java.util.Scanner;

class Main
{
	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	
	int[] men = new int[7];
	int[] kari = new int[7];
	
	for(int i=1; i<=6; i++){
		men[i] = scan.nextInt();}
	
	String Ord = scan.next();
	
	char[] ord = Ord.toCharArray();
	
	for(int i=0; i<ord.length; i++){
		if(ord[i]==('N')){
			kari[1] = men[1];		kari[2] = men[2];
			kari[5] = men[5];		kari[6] = men[6];
			
			men[1] = kari[2];		men[2] = kari[6];
			men[6] = kari[5];		men[5] = kari[1];
		}
		else if(ord[i]==('S')){
			kari[1] = men[1];		kari[2] = men[2];
			kari[5] = men[5];		kari[6] = men[6];
			
			men[1] = kari[5];		men[2] = kari[1];
			men[6] = kari[2];		men[5] = kari[6];
		}
		else if(ord[i]==('E')){
			kari[1] = men[1];		kari[3] = men[3];
			kari[4] = men[4];		kari[6] = men[6];
			
			men[1] = kari[4];		men[3] = kari[1];
			men[4] = kari[6];		men[6] = kari[3];
		}
		else{
			kari[1] = men[1];		kari[3] = men[3];
			kari[4] = men[4];		kari[6] = men[6];
			
			men[1] = kari[3];		men[3] = kari[6];
			men[4] = kari[1];		men[6] = kari[4];
		}}
		System.out.println(men[1]);
	}
}
