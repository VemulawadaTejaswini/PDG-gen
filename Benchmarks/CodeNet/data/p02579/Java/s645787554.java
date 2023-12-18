import java.util.*;
import java.io.*;

 class Main {
    
    static char[][] mat;
    
    public static boolean check(int x, int y) { return (x >= 0 && x < mat.length && y>=0 && y<mat[0].length); }
    
    public static void print(int[][] dis){
        for(int i = 0; i < dis.length; i++) System.out.println(Arrays.toString(dis[i]));
    }
    
    public static void magic( PriorityQueue<Node> q, int x, int y ){
        // // top two
        
        // q.add(x+1,y);
        // q.add(x+2,y);
        
        // // bottom
        // q.add(x-1,y);
        // q.add(x-2,y);
        
        // // left
        // q.add(x,y-1);
        // q.add(x,y-2);
        
        // // right
        // q.add(x,y+1);
        // q.add(x,y+2);
        
        // diagnoal left 
        // q.add(x-1,y-1);
        // q.add(x-2,y-2);
        
        // // diagnoal right 
        // q.add(x-1,y+1);
        // q.add(x-2,y+2);
        
        // // diagnoal b-l 
        // q.add(x+1,y-1);
        // q.add(x+2,y-2);
        
        // // diagnoal b-l 
        // q.add(x+1,y+1);
        // q.add(x+2,y+2);
        
        
        
    }
    
    public static void solve(int x, int y, int end_x, int end_y){
        Comparator<Node> c = Comparator.comparing(Node :: getCost);
       
        PriorityQueue<Node> q = new PriorityQueue(c);
        
        int[][] dis = new int[mat.length][mat[0].length];
        
        q.add(new Node(x,y,0));
        
        for(int i = 0; i < dis.length; i++)
            Arrays.fill(dis[i],Integer.MAX_VALUE);
    
        dis[x][y] = 0;
        
        boolean[][] visited = new boolean[mat.length][mat[0].length];
    
        
        while(!q.isEmpty()){
            Node pop = q.poll();
            visited[pop.x][pop.y] = true;
          //  System.out.println(pop.x + " " + pop.y + " -> ");
            int[] dx = {1,-1,0,0};
            int dy[] = {0,0,1,-1};
            
            // put neighbours
            for(int i = 0; i < dx.length; i++){
                int newX = pop.x + dx[i];
                int newY = pop.y + dy[i];
                if(check(newX,newY) && mat[newX][newY] == '.' && !visited[newX][newY]){
                    // add it with 0 cost
                    int newDis = 0;
                    if(dis[newX][newY] >= dis[pop.x][pop.y] + 0){
                        dis[newX][newY] = dis[pop.x][pop.y] ;
                        q.add(new Node(newX,newY,dis[pop.x][pop.y]));
                    }
                }
                
            }
            
            
            /// add magic wala scene
            int[] dxm = {1,2,-1,-2,0,0,0,0,-1,-2,-1,-2,1,2,1,2};
            int[] dym = {0,0,0,0,-1,-2,1,2,-1,-2,1,2,-1,-2,1,2};
             for(int i = 0; i < dxm.length; i++){
                int newX = pop.x + dxm[i];
                int newY = pop.y + dym[i];
                if(check(newX,newY) && mat[newX][newY] == '.' && !visited[newX][newY]){
                    // add it with 0 cost
                    int newDis = 0;
                    if(dis[newX][newY] >= dis[pop.x][pop.y] + 1){
                        dis[newX][newY] = dis[pop.x][pop.y] + 1;
                        q.add(new Node(newX,newY,dis[pop.x][pop.y] + 1));
                    }
                }
                
            }
            
            
            
               
        }
        if(dis[end_x][end_y] == Integer.MAX_VALUE)
            System.out.println(-1);
        else
           System.out.println(dis[end_x][end_y]);
        //print(dis);
    }

    public static void main(String[] args) throws Exception {
        Reader r = new Reader();
        int row = r.nextInt();
        int col = r.nextInt();
        
        int start_x = r.nextInt();
        int start_y = r.nextInt();
        
        int end_x = r.nextInt();
        int end_y = r.nextInt();
        mat = new char[row][col];
        for(int i = 0; i < row; i++){
            mat[i] = r.readLine().trim().toCharArray();
        }
        
        solve(start_x-1,start_y-1,end_x-1,end_y-1);
    }
}



class Node {
    int x;
    int y;
    int cost;
    Node(int x, int y, int cost){
        this.x = x;
        this.y = y;
        this.cost = cost;
    }
    int getCost() {return this.cost;}
}


 class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public String readLine() throws IOException 
        { 
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        } 
  
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9'); 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
  
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
  
            if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            } 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        } 
  
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        } 
  
        public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    } 
  