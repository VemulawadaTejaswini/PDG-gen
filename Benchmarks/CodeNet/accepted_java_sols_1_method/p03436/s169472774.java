import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        String s;
        int white=0;
        boolean[][]input=new boolean[h][w];
        boolean[][]visited=new boolean[h][w];
        visited[0][0]=true;
        for(int i=0;i<h;i++){
            s=sc.next();
            for(int j=0;j<w;j++){
                if(s.charAt(j)=='.'){
                    input[i][j]=true;
                    white++;
                }
                
            }
        }
        int[] movex={1,0,-1,0};
        int[] movey={0,1,0,-1};
        Queue<Integer> queuex=new ArrayDeque<>();
        Queue<Integer> queuey=new ArrayDeque<>();
        queuex.add(0);
        queuey.add(0);
        int size;
        for(int i=0;i<h*w;i++){
            size=queuex.size();
            for(int j=0;j<size;j++){
                for(int k=0;k<4;k++){
                    try{
                        if(input[queuex.peek()+movex[k]][queuey.peek()+movey[k]]&&!visited[queuex.peek()+movex[k]][queuey.peek()+movey[k]]){
                            visited[queuex.peek()+movex[k]][queuey.peek()+movey[k]]=true;
                            queuex.add(queuex.peek()+movex[k]);
                            queuey.add(queuey.peek()+movey[k]);
                            
                        }
                        if(queuex.peek()+movex[k]==h-1&&queuey.peek()+movey[k]==w-1){
                            System.out.println(white-i-2);
                            return;
                        }
                    }catch(Exception e){}
                }
                queuex.poll();
                queuey.poll();
            }
        }
        System.out.println(-1);
    }
}