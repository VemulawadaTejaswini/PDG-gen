import java.util.Scanner;

class Test {

	public static void main(String[] args) {
		//入力導入部
		Scanner sc=new Scanner(System.in);
		
		
		while(true){
		int m=sc.nextInt();
		int f=sc.nextInt();
		int r=sc.nextInt();
		if(m==-1&&f==-1&&r==-1)break;
		//成績部分
		else{int t=m+f;
			
			if(m==-1||f==-1)System.out.println("F");
			else if(t>=80)System.out.println("A");
			else if(t>=65)System.out.println("B");
			else if(t>=50)System.out.println("C");
			else if(t>=30)System.out.println(r>=50?"C":"D");
			else System.out.println("F");
		}
		}sc.close();

	}

}