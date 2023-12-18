import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	private static void print(String[] A){
		System.out.println(String.join(" ",A));
	}
	
	public static void selectionSort(String[] A){ // N??????????´??????????0-?????????????????????
		for(int i =0;i< A.length;i++){
			int mini = i;
			for(int j = i;j< A.length;j++){
				 if(Integer.parseInt(A[j].substring(1, 2))<Integer.parseInt(A[mini].substring(1, 2))){
					 mini = j;
				 }
			}
			if(mini!=i){
				String w=A[i];
				A[i]=A[mini];
				A[mini]=w;
			}
		}
		print(A);
	}
	
	private static void BubbleSort(String[] A){
		 for(int i = 0;i<=A.length-1;i++){
		     for(int j = A.length-1;j>=i+1;j--){
		    	 if(Integer.parseInt(A[j].substring(1, 2))<Integer.parseInt(A[j-1].substring(1, 2))){
		             String w=A[j];
		             A[j]=A[j-1];
		             A[j-1]=w;
		         }
		     }
		 }
		 print(A);
	}
	
	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
       // System.out.println("0".compareTo("1"));
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
            	int[] A=new int[Integer.parseInt(line)];
            	line=br.readLine();
            	String[] str=line.split(" ");
            	String[] str2=line.split(" ");
            	BubbleSort(str);
            	System.out.println("Stable");
            	selectionSort(str2);
            	if(Arrays.equals(str,str2)){
            		System.out.println("Stable");
            	}else{
            		System.out.println("Not stable");
            	}
            	
            	break;
            }
        }
	}

}