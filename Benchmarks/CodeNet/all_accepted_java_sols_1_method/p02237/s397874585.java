import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int big = Integer.parseInt(sc.nextLine());
        
        int[][] adj = new int[big][big];
        ArrayList<Integer> vertex = new ArrayList<Integer>();
        
        for(int i=0;i<big;i++){
        	String line = sc.nextLine();
        	String[] linesp = line.split(" ");
        	
        	if(!linesp[1].equals("0")){
        	for(int j=2;j<linesp.length;j++){
        		vertex.add(Integer.parseInt(linesp[j]));
        	}
        	
        	for(int j=0;j<big;j++){
        		if(vertex.contains(j+1)){
        			adj[i][j]=1;
        		}else{
        			adj[i][j]=0;
        		}
        	}
        	}
        	
        	vertex.clear();
        }
        
        for(int i=0;i<big;i++){
        	for(int j=0;j<big;j++){
        		System.out.print(adj[i][j]);
        		if(j!=big-1){
        			System.out.print(" ");
        		}else{
        			System.out.println();
        		}
        	}
        }
    }
}