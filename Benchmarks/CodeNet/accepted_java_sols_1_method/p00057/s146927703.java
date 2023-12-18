import java.util.Scanner;
class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int line;
		int area;
		
		while(scan.hasNext()){
			line = scan.nextInt();
			
			if(line == 1){
				area = 2;
			}else{
				area = 1 + line + (line*(line-1)/2);
			}
			System.out.println(area);
		}
		
		scan.close();
	}
}