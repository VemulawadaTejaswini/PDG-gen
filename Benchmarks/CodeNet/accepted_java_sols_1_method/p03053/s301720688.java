import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        String[] input=new String[h];
        boolean[][] inp=new boolean[h][w];
        Queue<Integer>y=new ArrayDeque<>();
        Queue<Integer>x=new ArrayDeque<>();
        for(int i=0;i<h;i++){
            input[i]=sc.next();
            for(int j=0;j<w;j++){
                inp[i][j]=input[i].charAt(j)=='#';
                if(inp[i][j]){
                    y.add(i);
                    x.add(j);
                }
            }
        }
        int visited=x.size();
        int ans=0;
        int[] numsx={1,0,-1,0};
        int[] numsy={0,1,0,-1};
        int sizetmp;
        while(true){
            if(visited==h*w){
                System.out.println(ans);
                return;
            }
            ans++;
            sizetmp=x.size();
            for(int i=0;i<sizetmp;i++){
                for(int j=0;j<4;j++){
                    try{
                        if(!inp[y.peek()+numsy[j]][x.peek()+numsx[j]]){
                            inp[y.peek()+numsy[j]][x.peek()+numsx[j]]=true;
                            visited++;
                            y.add(y.peek()+numsy[j]);
                            x.add(x.peek()+numsx[j]);
                        }
                    }catch(Exception e){}
                }
                x.remove();
                y.remove();
            }
        }
        
        
    }

}

