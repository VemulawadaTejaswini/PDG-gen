import java.util.Scanner;
class Main {
	int a,b,c,i;
	private int[] sei = new int[3];
	public void suzuki(){
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a < b){
			if(b < c){
				sei[0] = a;
				sei[1] = b;
				sei[2] = c;
				System.out.println(sei[0] + " " + sei[1] + " " + sei[2]);
			}else if(a < c){
				sei[0] = a;
				sei[1] = c;
				sei[2] = b;
				System.out.println(sei[0] + " " + sei[1] + " " + sei[2]);
			}else{
				sei[0] = c;
				sei[1] = a;
				sei[2] = b;
				System.out.println(sei[0] + " " + sei[1] + " " + sei[2]);
			}
		}else if(a < c){
			sei[0] = b;
			sei[1] = a;
			sei[2] = c;
			System.out.println(sei[0] + " " + sei[1] + " " + sei[2]);
		}else if(b < c){
			sei[0] = b;
			sei[1] = c;
			sei[2] = a;
			System.out.println(sei[0] + " " + sei[1] + " " + sei[2]);
		}else{
			sei[0] = c;
			sei[1] = b;
			sei[2] = a;
			System.out.println(sei[0] + " " + sei[1] + " " + sei[2]);
		}
	}
	public static void main(String[] args){
		new Main().suzuki();
	}
}