import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=sc.nextInt();
  		int min=0;
  		int total=0;
		
  		int[] aji=new int[n];
		for(int c=0;c<n;c++){
    		aji[c]=l+(c+1)-1;
            total+=aji[c];
            if(Math.abs(aji[min])>=Math.abs(aji[c])){
            	min=c;
            }
    	}
      

    	System.out.println(total-aji[min]);
    }
}

