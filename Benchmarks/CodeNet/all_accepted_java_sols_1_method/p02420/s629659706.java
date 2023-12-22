import java.util.Scanner;

class Main
{
	public static void main(String[]args){
	Scanner scan = new Scanner(System.in);
	
	int X = 0;
	String[] str = new String[10];
	char[] kari = new char[200];
	int[] m = new int[10];
	int[][] h = new int[10][200];
	String kekka;
	int i, x, z, j, q, r;
	String a = "";
	String kari2;
		
	while(scan.hasNext()){
		str[X] = scan.next();
		if(str[X].equals("-")){
			break;}
		kari2 = scan.next();
		m[X] = Integer.parseInt(kari2);
		for(i=0; i<m[X]; i++){
			kari2 = scan.next();
			h[X][i] = Integer.parseInt(kari2);}


		kekka = "";
		char[] tan = str[X].toCharArray();
		for(z=0; z<tan.length; z++){}
		for(i=0; i<m[X]; i++){
			for(j=0; j<h[X][i]; j++){
				kari[j] = tan[j];}
			for(q=0; q<z-j; q++){
				tan[q] = tan[j+q];}
			for(r=q; r<z; r++){
				tan[r] = kari[r-q];}}
		for(j=0; j<tan.length; j++){
				kekka += tan[j];}
		System.out.println(kekka);}
	}
}
