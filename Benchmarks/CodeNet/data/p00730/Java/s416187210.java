import java.util.*;

class Main{

    int n, w, d;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            n = sc.nextInt();
            w = sc.nextInt();
            d = sc.nextInt();
            if(n==0 && w==0 && d==0) break;

            //x, y, w, h
            LinkedList<int[]> q = new LinkedList<int[]>();
            q.add(new int[]{0,0,w,d});

            for(int i=0; i<n; i++){
                int p = sc.nextInt()-1;
                int s = sc.nextInt();

                int[] qq = q.get(p);
                q.remove(p);
                int x = qq[0], y = qq[1], W = qq[2], H = qq[3];
                s = s%((W+1)*2+(H-1)*2);

                int nx = x, ny = y;
                
                while(nx+1<=x+W && s-1>=0){nx++; s--;}
                while(ny+1<=y+H && s-1>=0){ny++; s--;}
                while(nx-1>=x && s-1>=0){nx--; s--;}
                while(ny-1>=y && s-1>=0){ny--; s--;}

                if(nx==x || nx==x+W){
                    int ny1 = ny-y, ny2 = H+y-ny;
                    int[] n1 = {x, y, W, ny1};
                    int[] n2 = {x, ny, W, ny2};
                    if(ny1<ny2){
                        q.add(n1); q.add(n2);
                    }else{
                        q.add(n2); q.add(n1);
                    }
                }else{
                    int nx1 = nx-x, nx2 = W+x-nx;
                    int[] n1 = {x, y, nx1, H};
                    int[] n2 = {nx, y, nx2, H};
                    if(nx1<nx2){
                        q.add(n1); q.add(n2);
                    }else{
                        q.add(n2); q.add(n1);
                    }
                }
            }

            PriorityQueue<Integer> ans = new PriorityQueue<Integer>(10, new Comparator<Integer>(){
                    public int compare(Integer a, Integer b){
                        return (int)(a-b);
                    }
                });

            while(q.size()>0){
                int[] qq = q.poll();
                ans.add(new Integer(qq[2] * qq[3]));
            }

            while(ans.size()>1) System.out.print(ans.poll()+" ");
            if(ans.size()==1) System.out.println(ans.poll());
            else System.out.println();
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}