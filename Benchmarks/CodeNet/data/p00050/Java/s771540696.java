import java.util.Scanner;

public class Main {

	static Scanner sc = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		String str=sc.nextLine();
		String [] st = str.split(" ");

		for(int i=0;i<st.length-1;i++){
			if(st[i].equals("peach")){
				st[i]="apple";
				System.out.print(st[i]+" ");
			}else if(st[i].equals("apple")){
				st[i]="peach";
				System.out.print(st[i]+" ");
			}else{
				System.out.print(st[i]+" ");

			}
		}
		if(st[st.length-1].equals("peach.")){
			st[st.length-1]="apple.";
			System.out.print(st[st.length-1]);
		}else if(st[st.length-1].equals("apple.")){
			st[st.length-1]="peach.";
			System.out.print(st[st.length-1]);
		}else{
			System.out.print(st[st.length-1]);

		}

	}

}