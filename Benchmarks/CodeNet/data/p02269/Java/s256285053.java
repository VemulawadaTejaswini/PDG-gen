import java.util.Scanner;
public class Main {
	static int change(String letter){
		int n=0,a;
		for(int i=0;i<letter.length();i++){
			switch(letter.charAt(i)){
			case 'A':
				a=1;
				break;
			case 'C':
				a=2;
				break;
			case 'G':
				a=3;
				break;
			case 'T':
				a=4;
				break;
			default:
				a=0;
				break;
			}
			n=n+a*(int)Math.pow(4, i);
		}
		return n;
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		boolean[] b=new boolean[(int)Math.pow(5, 12)];
		int n=scan.nextInt();
		String command;
		for(int i=0;i<n;i++){
			command=scan.next();
			if(command.equals("insert")){
				command=scan.next();
				b[change(command)]=true;
			}else{
				command=scan.next();
				if(b[change(command)]){
					System.out.println("yes");
				}else{
					System.out.println("no");
				}
			}
		}

		scan.close();
	}
}