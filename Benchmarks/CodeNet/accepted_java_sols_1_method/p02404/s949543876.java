import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		
		while(true){
			if(h==0 && w==0) break;
			
	        StringBuilder shp1=new StringBuilder();
	        for(int p=0;p<w;p++){
	        	shp1.append("#");
	        }
	         
	        StringBuilder shp2=new StringBuilder();
	        shp2.append("#");
		    for(int p=0;p<w-2;p++){
	        	shp2.append(".");
	        }
	        shp2.append("#");
	                
	        System.out.println(shp1);
	        for (int i=0;i<h-2;i++){
	        	System.out.println(shp2);
	        }
	        System.out.println(shp1+"\n");
	        
			h=sc.nextInt();
			w=sc.nextInt();

		}
	}

}