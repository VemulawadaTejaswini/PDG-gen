import java.util.Scanner;

/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner as = new Scanner(System.in);
		
		int n = 0;
		double minc = 0;
		double manh = 0;
		double sank = 0;
		double cheb = 0;
		double keisan = 0;
		String str = "";
		
		double xve[];
		double yve[];
		
		
		n = as.nextInt();
		
		xve = new double[n];
		yve = new double[n];
		
		for(int i=0;i<n;i++){
			
			xve[i] = as.nextDouble();
			
		}
		
		for(int i=0;i<n;i++){
			
			yve[i] = as.nextDouble();
			
		}
		
		for(int i=0;i<n;i++){
			
			minc += Math.abs(xve[i]-yve[i]);
			
		}
		
		for(int i=0;i<n;i++){
			
			keisan = Math.pow((Math.abs(xve[i]-yve[i])),2);
			manh += keisan;
			
		}
		
		for(int i=0;i<n;i++){
			
			keisan = Math.pow((Math.abs(xve[i]-yve[i])),3);
			sank += keisan;
			
		}
		
		for(int i=0;i<n;i++){
			
			keisan = Math.abs(xve[i]-yve[i]);
			if(cheb < keisan){
				
				cheb = keisan;
				
			}
			
		}
		
		manh = Math.sqrt(manh);
		//System.out.println(sank);
		sank = Math.cbrt(sank);
		//System.out.println(sank);
		
		
		str = String.valueOf(minc);
		System.out.println(str);
		str = String.valueOf(manh);
		System.out.println(str);
		str = String.valueOf(sank);
		System.out.println(str);
		str = String.valueOf(cheb);
		System.out.println(str);

	}

}