import java.util.Scanner;

class Main{
	public void open(){System.out.println("Ｏｐｅｎ");}
	public void close(){System.out.println("Ｃｌｏｓｅ");}
	
	public void run(){
		Scanner sc = new Scanner(System.in);
		String state = sc.nextLine();
		
		if(state.equals("100"))close();
		else if(state.equals("010"))close();
		else if(state.equals("110"))open();
		else if(state.equals("001"))open();
		else if(state.equals("000"))close();
	}
	public static void main(String[] args){new Main().run();}
}