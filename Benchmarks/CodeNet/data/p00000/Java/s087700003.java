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
        for (int i = 1; i <= w; i ++){
            for(int j = 1; j <= w;j ++) {
                System.out.println(i*j);
            }
        }
    }
}