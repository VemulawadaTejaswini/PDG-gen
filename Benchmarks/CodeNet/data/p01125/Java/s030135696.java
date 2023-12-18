import java.util.*;

 public class Main{    
        
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> ans = new ArrayList<String>();
        
        
        while(true){
            int N = sc.nextInt();
            int map[][] = new int[21][21];            
            if(N == 0){
                break;
            }      
            int startx = 10;
            int starty = 10;
            for(int i = 0;i < N;i++){
                map[sc.nextInt()][sc.nextInt()] = 1;
            }            
            int M = sc.nextInt();
            int x = 10;
            int y = 10;
            int count = 0;
            
            for(int i = 0;i < M;i++){
                char d = sc.next().charAt(0);
                int  l = sc.nextInt();
                if(count != N){
                    int dx = 0;
                    int dy = 0;
                    if(d == 'N'){
                        dy = 1;
                    }else if(d == 'E'){
                        dx = 1;
                    }else if(d == 'W'){
                        dy = -1;
                    }else if(d == 'S'){
                        dx = -1;
                    }
                    
                    for(int j = 0;j < l;j++){
                        count += map[x][y];
                        map[x][y] = 0;
                        x += dx;
                        y += dy;
                    }             
                    count += map[x][y];
                    map[x][y] = 0;
                }  
            }
            
                if(count == N){
                    System.out.println("YES");
                }else{
                    System.out.println("No");
                }
                                  
        }
       
        for(int i = 0;i < ans.size();i++){
            System.out.println(ans.get(i));
        }
        
    }
 }
        
        
        