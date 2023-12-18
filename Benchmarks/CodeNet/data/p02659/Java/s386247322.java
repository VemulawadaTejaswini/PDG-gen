public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);

    	double A = sc.nextDouble();
    	double B = sc.nextDouble();

    	long times2 = (long) (A*B*100);
    	long times = (times2 - times2%100)/100;
    	System.out.println(times);
    }
}