import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//initialization
        String[] s;
        int unit = 0,
            sale = 0,
            sum  = 0,
            kind = 0,
            num  = 0,
            avg  = 0;

        //input
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
        	s = sc.nextLine().split(",");
        	unit = Integer.parseInt(s[0]);
        	sale = Integer.parseInt(s[1]);

        	//calculation
        	kind++;
        	sum += unit * sale;
        	num += sale;
        }

        avg = Math.round((float) num / kind);

        //output
        System.out.println(sum);
        System.out.println(avg);
    }
}