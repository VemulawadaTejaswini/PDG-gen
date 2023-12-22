import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a= Integer.parseInt(s);
        s = sc.nextLine();
        int b= Integer.parseInt(s);
        s = sc.nextLine();
        int c= Integer.parseInt(s);
        s = sc.nextLine();
        int d= Integer.parseInt(s);

        int sum =0;

        if(a<b) { sum+=a;
        } else {
        	sum+=b;
        }
        if(c<d) { sum+=c;
        } else {
        	sum+=d;
        }

        System.out.println(sum);

	}

}
