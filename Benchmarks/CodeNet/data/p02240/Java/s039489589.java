import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
 
public class Main {
	static int[] group = new int[100000];
	static int currentGroupID = 0;
    /**
     * @param args
     * @throws IOException 
     * @throws NumberFormatException 
     */
    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmpArray = br.readLine().split(" ");
        int n = Integer.parseInt(tmpArray[0]);
        int m = Integer.parseInt(tmpArray[1]);
         
        Arrays.fill(group, 0);
        
        boolean[][] matrix = new boolean[n][n];
         
        for(int i = 0; i < n; i++){
            Arrays.fill(matrix[i], false);
        }
        for(int i = 0 ; i < m; i++){
            tmpArray = br.readLine().split(" ");
            int id1 = Integer.parseInt(tmpArray[0]);
            int id2 = Integer.parseInt(tmpArray[1]);
             
            matrix[id1][id2] = true;
            matrix[id2][id1] = true;
             
        }
         
        
        int[] visited = new int[n];
        Arrays.fill(visited, 0);
         
        int q = Integer.parseInt( br.readLine());
         
        for(int i = 0; i < n; i++){
        	if(group[i] == 0){
        		currentGroupID++;
        		dfsGrouping(matrix, visited, i);
        		Arrays.fill(visited, 0);
        	}
        }
        
        for(int i = 0; i < q; i++){
            tmpArray = br.readLine().split(" ");
            int start = Integer.parseInt(tmpArray[0]);
            int target = Integer.parseInt(tmpArray[1]);
            /* 
            if(dfsSearch(matrix, visited, start, target)){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }*/
            if(group[start] == group[target] && group[start] != 0){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
            
            Arrays.fill(visited, 0);
        }
        

        /*
        int time = 0;
        for(int i = 1; i <= n ; i++){
            if(visited[i] <= 0){
                time = dfs(matrix, visited, finished, i, time);
            }
        }
         
        for(int i = 1; i <= n ; i++){
            System.out.println(i + " " + visited[i] + " " + finished[i]);
        }*/
        /*
        for(int i = 0; i < n; i++){
            for(int j = 0 ; j < n ; j++){
                if(j == 0){
                    System.out.print(matrix[i][j]);
                }
                else {
                    System.out.print(" "+matrix[i][j]);
                }
            }
            System.out.println();
        }
        */
         
    }
     
    static boolean dfsSearch (boolean[][] matrix, int[] visited, int v, int targetID){
        //System.out.println("current vertex is "+v);
        visited[v] = 1;
        boolean found = false;
         
        for(int i = 0; i < matrix[v].length ; i++){
            if(matrix[v][i] == true && visited[i] <= 0){
                if(i == targetID){
                    //System.out.println("v = "+v + "i = "+i);
                    return true;
                }
                found = dfsSearch(matrix, visited, i, targetID);
                if(found){
                    return true;
                }
            }
        }
         
        return false;
    }
    
    static boolean dfsGrouping (boolean[][] matrix, int[] visited, int v){
        //System.out.println("current vertex is "+v);
        visited[v] = 1;
        group[v] = currentGroupID;
         
        for(int i = 0; i < matrix[v].length ; i++){
            if(matrix[v][i] == true && visited[i] <= 0){
            	group[i] = currentGroupID;
                dfsGrouping(matrix, visited, i);
            }
        }
         
        return false;
    }
 
}