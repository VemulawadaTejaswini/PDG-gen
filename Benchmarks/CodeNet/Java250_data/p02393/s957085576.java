import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner( System.in);
		int eles[];
		eles=new int[3];

		eles[0] = kb.nextInt();
		eles[1] = kb.nextInt();
		eles[2] = kb.nextInt();
		
		int tmp;
		for( int i=0; i<3; i++) {
			for( int j=i+1; j<3; j++) {
				if( eles[j] < eles[i] ) {
					tmp=eles[i];
					eles[i]=eles[j];
					eles[j]=tmp;
				}
			}
		}
		System.out.println( eles[0]+" "+eles[1]+" "+eles[2] );	
	}
}