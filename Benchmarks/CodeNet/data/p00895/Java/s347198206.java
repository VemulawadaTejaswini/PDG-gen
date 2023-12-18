import java.util.*;

class Main{

    int h, w;
    int[] dx = {0, 0, 1, -1, 1, 1, -1, -1};
    int[] dy = {1, -1, 0, 0, 1, -1, 1, -1};
    char[][] donut;
    String cutS;

    @SuppressWarnings("unchecked")
    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            h = sc.nextInt();
            w = sc.nextInt();
            if(h==0 && w==0) break;

            donut = new char[h][w];
            for(int i=0; i<h; i++){
                String line = sc.next();
                donut[i] = line.toCharArray();
            }

            int max = 0;
            StringBuilder minString = new StringBuilder();

            for(int l=h*w-1; l>=2; l--){
                ArrayList<String> list = new ArrayList<String>();
                for(int i=0; i<h; i++){
                    for(int j=0; j<w; j++){
                        for(int k=0; k<8; k++){                        
                            StringBuilder s = new StringBuilder();
                            s.append(donut[i][j]);
                            int ny = (i + dy[k]) % h, nx = (j + dx[k]) % w;
                            if(ny==-1) ny = h-1;
                            if(nx==-1) nx = w-1;
                            while(!(ny==i && nx==j)){
                                if(s.length()==l) break;
                                s.append(donut[ny][nx]);
                                ny = (ny + dy[k]) % h;
                                nx = (nx + dx[k]) % w;
                                if(ny==-1) ny = h-1;
                                if(nx==-1) nx = w-1;
                            }
                            if(s.length()!=l) continue;

                            if(!list.contains(s.toString())) list.add(s.toString());
                            else if(minString.length()==0 || min(s, minString)){
                                max = s.length();
                                minString = s;
                            }
                        }
                    }
                }
                if(max!=0) break;
            }

            if(minString.length()==0) System.out.println(0);
            else System.out.println(minString.toString());
        }
    }

    boolean min(StringBuilder s1, StringBuilder s2){ //s1 < s2?
        int l1 = s1.length(), l2 = s2.length();
        for(int i=0; i<Math.min(l1, l2); i++){
            if(s1.charAt(i)<s2.charAt(i)) return true;
            else if(s1.charAt(i)>s2.charAt(i)) return false;
        }
        if(l1<l2) return true;
        return false;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}