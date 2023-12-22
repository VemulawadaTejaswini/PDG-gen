import java.util.Scanner;

/**
 * 
 */

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
		StringBuilder sb = new StringBuilder();
		Scanner as = new Scanner(System.in);
		
		int n = 0;
		int i = 0;
		int j = 0;
		int count = 0;
		int gre[];
		int pnum[];
		
		n = Integer.parseInt(as.next());
		
		pnum = new int[n];
		gre = new int[n];
		
		for(i=0;i<n;i++){
			
			pnum[i] = Integer.parseInt(as.next());
			gre[i] = (int) Math.sqrt(pnum[i]);
			//System.out.println("moto:"+pnum[i]);
			//System.out.println("root:"+gre[i]);
			
		}
		
		for(i=0;i<n;i++){
			for(j=2;j<=gre[i]+1;j++){
				
				if(j == gre[i]+1 && pnum[i] != 1){
					
					//System.out.println(pnum[i]);
					count++;
					
				}
				if(pnum[i] % j == 0){
					
					break;
					
				}
				
			}
		
		}
		
		sb.append(count);
		System.out.println(sb.toString());

	}

}