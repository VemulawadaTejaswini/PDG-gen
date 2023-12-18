import java.io.*;

class Main{
    public static void main(String args[]){
        Qq q = new Qq(9);
        q.outputQQ();
    }
}

class Qq{
    int wide;

    Qq(int w){
        wide = w;
    }
    
    void outputQQ(){
        for (int i = 1; i <= wide; i ++){
            for(int j = 1; j <= wide;j ++) {
                System.out.printf("%dx%d=%d\n", i, j, i*j);
            }
        }
    }
}