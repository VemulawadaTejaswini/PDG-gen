import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws NumberFormatException,IOException{
		int n,i,j,minj;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String buf = br.readLine();
		n = Integer.parseInt(buf);
			

		String[] arr = new String[n]; /*arr???????????????????????¨*/
		String[] arr1 = new String[n]; /*arr1????????¬????????§??????????????¨*/

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader ar = new BufferedReader(is);

		String str = ar.readLine(); /*str????????????????????????????????????????????¨*/
		arr = str.split(" "); 
		arr1 = str.split(" ");
	
		
		/*??????????????????*/
		for(i=0;i<n;i++){
			boolean bln = true;
			while(bln){
				bln = false;
			for(j=n-1;1<=j;j--){
				if(arr[j].charAt(1)<arr[j-1].charAt(1)){
					String temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					bln = true;
				}
			}
			}
		}

		/*??¨???*/
		for(i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
			System.out.println("\nStable");


			/*?????¬????????§????????????*/
			for(i=0;i<n-1;i++){
				  minj = i;
				for(j=i;j<n;j++){
					if(arr1[j].charAt(1)<arr1[minj].charAt(1)){
						minj = j;
					}
				}
					String temp1 = arr1[i];
					arr1[i] = arr1[minj];
					arr1[minj] = temp1;
						
			}
				
		
			/*??¨???*/
			for(i=0;i<n;i++){
				System.out.print(arr1[i]+" ");
			}
				System.out.println();

				boolean bln1 = true;
			/*??????*/
			for(i=0;i<n;i++){
				if(!arr[i].equals(arr1[i])) bln1 = false;
			}

			if(bln1)System.out.println("Stable");
			else System.out.println("Not stable");
}
}