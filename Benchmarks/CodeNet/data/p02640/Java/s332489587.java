import java.util.Scanner;
// B	Crane and Turtle
class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int ba = sc.nextInt();
		int bb = sc.nextInt();

		int turu=0;
		int kame=0;

		for(int i=0;i<=(bb/2);i++){

			int a=0;

			a=bb-(i*2);

			if(a%4==0 && (i+a/4)==ba){
				turu=i;
				kame=a/4;
				break;
			}

		}

		if(turu==0 && kame==0){
			System.out.println("No");
			}else{
			System.out.println("Yes");
		}
	}
}