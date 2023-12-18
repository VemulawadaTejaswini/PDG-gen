import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int kaisu=0;
		String str="";
		int motometai=0;
		while(sc.hasNext()) {
			str=sc.next();
			motometai=Integer.parseInt(str);
			if(motometai==0) {
				System.exit(0);
			}
			int kotae=kaijyo0(motometai);
			System.out.println(kotae);
		}
	}

	public static int kaijyo0(int i) {		//かいじょうしたときの0の数
		 int kaisu=0;

		 if(i<5)return kaisu;
		 kaisu+=i/5+kaijyo0(i/5);
		 return kaisu;
	}
}
