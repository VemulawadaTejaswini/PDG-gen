import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		for(int i=1;i<10001;i++){
			String val=scan.nextLine();
			String [] num=val.split(" ",0);
			int x=Integer.parseInt(num[0]);
			int y=Integer.parseInt(num[2]);
			if(num[1].equals("+")){
				System.out.println(x+y);
			}else if(num[1].equals("-")){
				System.out.println(x-y);
			}else if(num[1].equals("*")){
				System.out.println(x*y);
			}else if(num[1].equals("/")){
				System.out.println(x/y);
			}else{
				System.exit(0);
			}
		}
	}
}