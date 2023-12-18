import java.util.Scanner;

public class Main{
	public Main(){
		int a = 0, b = 0, o = 0, ab = 0;
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String[] str = (sc.nextLine()).split(",");
			
			if(str[1].equals("A")){
				a++;
			} else if(str[1].equals("B")){
				b++;
			} else if(str[1].equals("O")){
				o++;
			} else {
				ab++;
			}
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(ab);
		System.out.println(o);
	}
	
	public static void main(String[] args){
		Main test = new Main();
	}
}