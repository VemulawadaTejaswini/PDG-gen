import java.util.Scanner;

class Main
{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	
	int a = 0;
	int tas = 0;;
	int q;
	int i;
	int z;
	int j = 0;
	int b = 0;
	
	String Bun = scan.nextLine();
	String Miz = scan.nextLine();
	
	Bun = Bun + Bun;
	
	char[] bun = Bun.toCharArray();
	char[] miz = Miz.toCharArray();
		
	for(q=0; q<miz.length; q++){
	}
		
	for(z=0; z<bun.length; z++){
	}
		
	int x = z - q;
	
	for(i=0; i<x; i++){
		if(bun[i]==miz[j]){
			for(j=0; j<=q; j++){
				if(bun[i+j]!=miz[j])	{
					tas = 0;
					j = 0;
					break;				}
				tas++;	
				if(tas==q){
				a = 1;
				b = 1;
				break;     }}
		}
		if(b==1){
			break;}
	}
		if(a==1){	
			System.out.println("Yes");}
		else{
			System.out.println("No");}
	}
}
