import java.util.Scanner;

class Main{
	static long[] mono;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		while(true) {
			int kazu=sc.nextInt();
			long price=sc.nextLong();
			if(kazu==0 && price==0) {
				System.exit(0);
			}
			mono=new long[kazu];
			for(int i=0; i<kazu; i++) {
				mono[i]=sc.nextInt();
			}
			long tmp=0;
			long kiroku=0;
			for(int i=0; i<kazu; i++) {
				tmp=mono[i];
				for(int j=i+1; j<kazu; j++) {
					if(tmp+mono[j]<=price && tmp+mono[j]>kiroku) {
						kiroku=tmp+mono[j];
					}
				}
			}
			if(kiroku==0) {System.out.println("NONE");}
			else{System.out.println(kiroku);}
		}
	}
}
