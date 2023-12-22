import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int number = Integer.parseInt(line);
        
        String line2 = sc.nextLine();
        String[] line2sp = new String[number];
    	line2sp=line2.split(" ");
    	int[] figArray = new int[number];
    	int[] afterSort = new int[number];
    	
    	 for(int i=0;i<number;i++){
    		 figArray[i]=Integer.parseInt(line2sp[i]);
    		 afterSort[i]=0;
    		 
         }    	 
    	 
    	 int insert=-1;
    	 
    	 for(int i=0;i<number;i++){
    		 insert=figArray[i];
    		 int j=i-1;
    		 
    		 while(j>=0&&figArray[j]>insert){
    			 figArray[j+1]=figArray[j];
    			 j--;
    			 figArray[j+1]=insert;
    		 }
    		 
    		 
    		 for(int k=0;k<number-1;k++){
    			 System.out.print(figArray[k]+" ");
    		 }
    		 System.out.println(figArray[number-1]);
    		 
    	 }
    }   
}