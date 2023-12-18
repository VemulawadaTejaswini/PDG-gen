import java.util.Scanner;


public class Main {
	
	static int[][] memory;
	
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        int D = sc.nextInt();
   
        int[][] number =new int[H*W+1][2];
        int[] distance =new int[H*W+1];
        
        
        for(int i = 0;i<H;i++){
        	
        	for(int j=0;j<W;j++){
        		
        		int current_number = sc.nextInt();
        		number[current_number][0]= i;
        		number[current_number][1]= j;
        		
        	}
        	
        	
        }
        
        for(int i=D;i<H*W+1;i++){
        	distance[i] = distance[i-D]+Math.abs(number[i][0]-number[i-D][0])+Math.abs(number[i][1]-number[i-D][1]);
        }
        
        int Q = sc.nextInt();
        int[] ans = new int[Q];
        
        for(int i=0;i<Q;i++){
        	
        	int L = sc.nextInt();
        	int R = sc.nextInt();
        	
        	ans[i]=distance[R]-distance[L];

        	
        	
        }
        
        for(int i=0;i<Q;i++)System.out.println(ans[i]);
        		
	}

		

    
}