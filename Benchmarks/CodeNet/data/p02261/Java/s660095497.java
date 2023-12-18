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
		
		String COO[];
		String CBO[];
		String CSO[];
		String treS = "";
		int CO[];
		int CB[];
		int CS[];
		int treI = 0;
		int minj = 0;
		
		int N = Integer.parseInt(as.next());
		
		COO = new String[N];
		CBO = new String[N];
		CSO = new String[N];
		CO = new int[N];
		CB = new int[N];
		CS = new int[N];
		
		for(int i=0;i<N;i++){
			
			COO[i] = as.next();
			CO[i] = Integer.parseInt(COO[i].substring(COO[i].length()-1));
			
		}
		
		CBO = COO.clone();
		CSO = COO.clone();
		CB = CO.clone();
		CS = CO.clone();
		
		for(int i=0;i<=N-1;i++){
			for(int j=N-1;j>=i+1;j--){
				
				if(CB[j] < CB[j-1]){
					
					treI = CB[j];
					CB[j] = CB[j-1];
					CB[j-1] = treI;
					treS = CBO[j];
					CBO[j] = CBO[j-1];
					CBO[j-1] = treS;
					
				}
				
			}
			
		}
		
		for(int i=0;i<=N-1;i++){
			
			minj = i;
			for(int j=i;j<=N-1;j++){
				
				if(CS[j] < CS[minj]){
					
					minj = j;
					
				}
				
			}
			
			treI = CS[i];
			CS[i] = CS[minj];
			CS[minj] = treI;
			treS = CSO[i];
			CSO[i] = CSO[minj];
			CSO[minj] = treS;
			
		}

		for(int i=0;i<N;i++){
			
			if(i != N-1){
				
				sb.append(CBO[i]).append(' ');
			
			}
			else{
				
				sb.append(CBO[i]);
				
			}
			
		}
		
		System.out.println(sb.toString());
		sb.setLength(0);
		sb.append("Stable");
		System.out.println(sb.toString());
		sb.setLength(0);
		
		for(int i=0;i<N;i++){
			
			if(i != N-1){
				
				sb.append(CSO[i]).append(' ');
			
			}
			else{
				
				sb.append(CSO[i]);
				
			}
			
		}
		
		System.out.println(sb.toString());
		sb.setLength(0);
		for(int i=0;i<N;i++){
			
			if(CBO[i].equals(CSO[i])){
				
				sb.setLength(0);
				sb.append("Stable");
			
			}
			else{
				
				sb.setLength(0);
				sb.append("Not stable");
				break;
				
			}
			
		}
		
		System.out.println(sb.toString());
	}

}