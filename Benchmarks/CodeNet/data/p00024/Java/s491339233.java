import java.util.Scanner;

public classツ　Math {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()){
			double in = s.nextDouble();
			for(int i=2 ; ; i++){
				if(Math.sqrt(19.6*5*(i-1))>in){
					System.out.println(i);
					break;
				}
			}
		}
    }
}