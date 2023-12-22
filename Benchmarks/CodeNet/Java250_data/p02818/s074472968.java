import java.util.Scanner;

class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		long takahashi = sc.nextLong();
		long aoki = sc.nextLong();
		long count = sc.nextLong();

		if(count <= takahashi){
			takahashi = takahashi - count;
		}else if((count > takahashi) && (count < (takahashi + aoki))){
			aoki = aoki - (count - takahashi);
			takahashi = 0;
		}else{
			takahashi = 0;
			aoki = 0;
		}
		System.out.println(takahashi + " " + aoki);
	}
}