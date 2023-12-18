import java.util.Scanner;

class Main
{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	
	String str;
	int i, q;
	int a = 0;
		
	String kob = scan.nextLine();
		
	while(true){
		str = scan.nextLine();
		if(str.equals("END_OF_TEXT")){
			break;}
		str = str.toLowerCase();
		String[] mini = str.split(" ", 0);
		
		for(int j=0; j<mini.length; j++){
			if(mini[j].equals(kob)){
				a++;}}}
		System.out.println(a);
		
	}
}
