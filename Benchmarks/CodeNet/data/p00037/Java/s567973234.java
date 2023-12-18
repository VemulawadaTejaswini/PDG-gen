import java.io.*;

class Wall {
    private static final int R = 0;
    private static final int L = 1;
    private static final int U = 2;
    private static final int D = 3;

    String w[] = new String[5];
    String h[] = new String[4];
    int Move,x,y;

    Wall(String w[],String h[]) {
        for (int i=0;i<4;i++) {
            this.w[i] = w[i];
            this.h[i] = h[i];
        }
        this.w[4] = w[4];
        this.Move = R;
        this.x = 1;
        this.y = 0;
        System.out.print("R");
    }

    boolean exception() {
         if (this.w[0].equals("1000")) {
              return true;
        } else return false;
    }

    void Walked() {
        while (true) {
            if (this.x==0&&this.y==0) break;
            if (this.Move==R) {
                while (this.x<=3&&w[this.y].charAt(this.x)=='1') {
                    System.out.print("R");
                    if (this.y>0&&h[this.y-1].charAt(this.x+1)=='1') {
                        this.y--;
                        this.x++;
                        this.Move = U;
                        break;
                    }
                    this.x++;
                }
                if (this.Move==R) this.Move = D;
            } else if (this.Move==L) {
                while (this.x>=0&&w[this.y].charAt(this.x)=='1') {
                    System.out.print("L");
                    if (this.y<=3&&h[this.y].charAt(this.x)=='1') {
                        this.Move = D;
                        break;
                    }
                    this.x--;
                }
                if (this.Move==L) {
                    this.x++;
                    this.y--;
                    this.Move = U;
                }
            } else if (this.Move==U) {
                while (this.y>=0&&h[this.y].charAt(this.x)=='1') {    
                    System.out.print("U");
                    if (this.x>0&&w[this.y].charAt(this.x-1)=='1') {
                        this.x--;
                        this.Move = L;
                        break;
                    }
                    this.y--;
                }
                if (this.Move==U) {
                    this.y++;
                    this.Move = R;
                }
            } else if (this.Move==D) {
                while (this.y<=3&&h[this.y].charAt(this.x)=='1') {
                    System.out.print("D");
                    if (this.x<=3&&w[this.y+1].charAt(this.x)=='1') {
                        this.y++;                    
                        this.Move = R;
                        break;
                    }
                    this.y++;
                }
                if (this.Move==D) {
                    this.x--;
                    this.Move = L;
                }
            }
        }
        if (exception()) System.out.print("L");
        System.out.println("");
    }
}
class Main {
    public static void main(String args[]) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String w[] = new String[5];
            String h[] = new String[4];
            for (int i=0;i<4;i++) {
                w[i] = br.readLine();
                h[i] = br.readLine();
            }
            w[4] = br.readLine();

            Wall wall = new Wall(w,h);
            wall.Walked();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}