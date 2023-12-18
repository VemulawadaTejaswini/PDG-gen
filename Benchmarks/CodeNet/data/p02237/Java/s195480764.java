import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner readMan = new Scanner(System.in);
        
        int nodesCount = readMan.nextInt();;
        int edgeCount = 0;
        
        int[][] edgeArray = new int[nodesCount][nodesCount];
        
        for(int i = 0; i < nodesCount; i++){ //each node will have its own row
            int vertix = readMan.nextInt();
            edgeCount = readMan.nextInt();
            for(int j = 0; j < edgeCount; j++){
                edgeArray[i][readMan.nextInt() - 1] = 1;
            }
        }
        
        for(int i = 0; i < nodesCount; i++){
            for(int j = 0; j < nodesCount -1; j++){
                System.out.print(edgeArray[i][j] + " ");
            }
            System.out.println(edgeArray[i][nodesCount - 1]);
        }
        
        
        readMan.close();
    }
}

