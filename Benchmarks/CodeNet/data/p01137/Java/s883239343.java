public class Main {

	public static void main(String[] args) {
		// インプットデータ取得
		Scanner sc = new Scanner(System.in);

        while(true) {
        	double m=sc.nextDouble();
        	if(m==0) {break;}
        	double x_double=0;
        	double y_double=0;
        	double z_double=0;
        	
        	//mの三乗根に一番近い整数値をzに入れたい
        	z_double=Math.cbrt(m);
        	System.out.println(z_double);

        }

	}

}

