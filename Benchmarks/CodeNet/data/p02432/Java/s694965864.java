import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int q = sc.nextInt();
			int[] A = new int[q];
			int head=0,foot=0;
			for(int i=0;i<q;i++) {
				int query = sc.nextInt();
				if(query==0) {
					switch(sc.nextInt()) {
					case 0:
						head--;
						A[(head+q)%q] = sc.nextInt();
						break;
					case 1:
						A[(foot+q)%q] = sc.nextInt();
						foot++;
						break;
					}
				}
				else if(query==1) {
					System.out.println(A[(head+sc.nextInt()+q)%q]);
				}
				else if(query==2) {
					switch(sc.nextInt()) {
					case 0:
						head++;
						break;
					case 1:
						foot--;
						break;
					}
				}
			}
		}
	}
}
