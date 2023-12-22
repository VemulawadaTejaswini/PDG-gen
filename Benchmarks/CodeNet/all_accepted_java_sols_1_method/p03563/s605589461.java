import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		String line2 = sc.nextLine();
        int iline1 = Integer.parseInt(line1);
        int iline2 = Integer.parseInt(line2);
        int plusrate = iline2 - iline1;
		System.out.println(iline2+plusrate);
    }
}
