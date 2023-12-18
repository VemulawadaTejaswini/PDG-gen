//Volume5-0522
import java.util.Scanner;
import java.util.regex.Pattern;

class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		Pattern JOI = Pattern.compile("^JOI.*"),
				IOI = Pattern.compile("^IOI.*");


		String s;
		int    jcnt,icnt;
		while(sc.hasNext()){
			s = sc.nextLine();
			jcnt=0; icnt=0;
			while(!s.isEmpty()){
				if     (JOI.matcher(s).matches()){jcnt++;}
				else if(IOI.matcher(s).matches()){icnt++;}
				s = s.substring(1);
			}
			System.out.printf("%d\n%d\n",jcnt,icnt);
		}
	}
}