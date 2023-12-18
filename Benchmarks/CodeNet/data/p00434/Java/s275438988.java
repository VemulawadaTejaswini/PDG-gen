import java.util.Scanner;
class Main {
	public static void main(String args[]){
		int[] student = new int[30];
		int i;
		Main app = new Main();
		
		while(true){
			Scanner scan = new Scanner(System.in);
			if(!scan.hasNext()){
				break;
			}
			for(i=0;i<30;i++){
				student[i] = 0;
			}
			app.submit(student,scan);
			app.who(student);
		}
	}
	
	public void submit(int[] student,Scanner scan){
		for(int i=0;i<28;i++){
			String str = scan.nextLine();
			int num = Integer.parseInt(str);
			student[num-1] = 1;
		}
	}
	
	public void who(int student[]){
		for(int i=0;i<30;i++){
			if(student[i] == 0){
				System.out.println(i+1);
			}
		}
	}
}