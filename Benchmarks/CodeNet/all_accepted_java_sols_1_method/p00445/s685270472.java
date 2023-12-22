import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
		String JOIOI = sc.next();
		int JOI = 0,IOI = 0;
		for(int i = 0; i < JOIOI.length() - 2; i++){
			if(JOIOI.substring(i, i + 3).equals("JOI"))
				JOI++;
			if(JOIOI.substring(i, i + 3).equals("IOI"))
				IOI++;;
		}
		System.out.println(JOI);
		System.out.println(IOI);
		}
		sc.close();
	}
}