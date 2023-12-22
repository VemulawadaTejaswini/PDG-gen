import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		double x=0,h=0;
		
		while(sc.hasNext()){
			x = sc.nextInt();
			h = sc.nextInt();
			if(x==0 && h==0) break;

			System.out.println(
					(x*x)+(((Math.sqrt(Math.pow(x/2,2)+Math.pow(h,2)))*x/2)*4));
			// x*X テ」ツ?古・ツコツ陛ゥツ敖「テァツゥツ?
			// テ、ツクツ嘉ィツァツ津・ツスツ「テ」ツ?ョテゥツォツ佚」ツ?陛」ツ?ッテ」ツ?』/2テ」ツ?ョテ、ツコツ古、ツケツ?hテ」ツ?ョテ、ツコツ古、ツケツ療」ツつ津」ツδォテ」ツδシテ」ツδ?
		}
	}

}