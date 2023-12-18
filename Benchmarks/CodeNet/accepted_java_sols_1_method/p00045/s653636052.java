import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int tan = 0 ;
		int suu = 0 ;
		int ave = 0;
		int total = 0;
		int kaz = 0;
		while (s.hasNext()) {
			String string = s.nextLine();
			String[] stra = string.split(",");
			tan = Integer.parseInt(stra[0]);
			suu = Integer.parseInt(stra[1]);
			total = (tan * suu) + total ; 
			kaz += suu;
			ave++;			
		}
		System.out.println(total);
		System.out.println((int)((double)kaz/ave+0.5));
		
		s.close();
	}

}