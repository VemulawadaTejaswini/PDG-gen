import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n=sc.nextInt();
			String[] s=new String[n+1];
			int j=0;
			for(int i=0; i<=n; i++) {
				String str=sc.nextLine();
				String[] token=str.split(" ");
				//System.out.println(token[0]);
				if(token[0].equals("insert")) {
					s[j]=token[1];
					j++;
				}
				else if(token[0].equals("find")) {
					boolean tf=false;
					for(int k=0; k<j; k++) {
						if(s[k].equals(token[1])) {
							tf=true;
							break;
						}
					}
					if(tf)	System.out.println("yes");
					else	System.out.println("no");
				}
			}

		}
	}
}
