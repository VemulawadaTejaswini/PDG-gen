import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] tango=new String[100];
		int cnt=1;

		int kazu=sc.nextInt();

		tango[0]=sc.next();
		String tmp="";

		for(int i=1; i<kazu; i++) {
			tmp=sc.next();
			for(int j=0; j<cnt; j++) {
				if(!tmp.equals(tango[j])) {
					//
				}
				else if(tmp.equals(tango[j])) {
					System.out.println("No");
					System.exit(0);
				}
			}
			tango[cnt]=tmp;
			cnt++;
		}

		for(int i=1; i<kazu; i++) {
			if(tango[i-1].charAt(tango[i-1].length()-1)==tango[i].charAt(0)) {
				//
			}
			else if(tango[i-1].charAt(tango[i-1].length()-1)!=tango[i].charAt(0)) {
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");
	}
}