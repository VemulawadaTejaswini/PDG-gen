import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);

    	int L = sc.nextInt();

//    	BigDecimal POWL3 = new BigDecimal(L*L*L);
//
//    	BigDecimal ts = new BigDecimal(27);
//
//    	BigDecimal V = POWL3.di

    	int POWL3 = L*L*L;
    	double V = (double)POWL3/27;

    	System.out.println(String.format("%.8f", V));

    }

}