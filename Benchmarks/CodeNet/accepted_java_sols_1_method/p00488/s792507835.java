import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] spa = new int[3];
		int[] juice = new int[2];
		int a=2001;
		for(int i=0; i<3; i++){
			spa[i]=sc.nextInt();
		}
		for(int j=0; j<2; j++){
			juice[j]=sc.nextInt();
		}
		for(int i=0; i<3; i++){
			for(int j=0; j<1; j++){
				int work=spa[i]+juice[j];
				int work2=spa[i]+juice[j+1];
				if(work<work2){
					if(work<a){
						a=work;
					}
				}else if(work2<a){
					a=work2;
				}
			}
		}
		System.out.println(a-50);
		// TODO Auto-generated method stub

	}

}