
class Main {
    public static void main(String args[]) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[][] adjacency = new int[n][n];

        for(int i=0; i<n; i++){
            int vIndex = Integer.parseInt(sc.next())-1;
            int nAdj = Integer.parseInt(sc.next());
            for(int j=0; j<nAdj; j++){
                int connectTo = Integer.parseInt(sc.next())-1;
                adjacency[vIndex][connectTo] = 1;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j== n-1)  System.out.println(adjacency[i][j]);
                else  System.out.print(adjacency[i][j]+" ");
            }
        }
        
    }
}

