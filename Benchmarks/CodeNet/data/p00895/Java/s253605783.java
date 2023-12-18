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
            String minString = "0";
            ArrayList[] list = new ArrayList[201];
            for(int i=0; i<201; i++) list[i] = new ArrayList<String>();

            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    for(int k=0; k<8; k++){
                        
                        String s = "";
                        s += donut[i][j];
                        int ny = (i + dy[k]) % h, nx = (j + dx[k]) % w;
                        if(ny==-1) ny = h-1;
                        if(nx==-1) nx = w-1;
                        while(!(ny==i && nx==j)){
                            s += donut[ny][nx];
                            ny = (ny + dy[k]) % h;
                            nx = (nx + dx[k]) % w;
                            if(ny==-1) ny = h-1;
                            if(nx==-1) nx = w-1;
                            if(!list[s.length()].contains(s) && s.length()>=max) list[s.length()].add(s);
                            else if(s.length()>max || (s.length()==max && (minString.equals("0") || min(s, minString)))){
                                if(max<s.length()){
                                    for(int l=0; l<max; l++){
                                        list[i] = new ArrayList<String>();
                                    }
                                }
                                max = s.length();
                                minString = s;
                            }
                        }
                    }
                }
            }

            System.out.println(minString);
        }
    }

    boolean min(String s1, String s2){ //s1 < s2?
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