import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String stone = sc.next();
        sc.close();
        for(int i=0;i<N; i++){
            int start = stone.indexOf("WR");
            if(start==-1 && (stone.indexOf("W") == -1 || stone.indexOf("R") == -1)){
                System.out.println(0);
                break;
            }
            int R = getR(stone,start);
            int W = getW(stone,start);
            if(R == W){
                System.out.println(getR(stone,start));
                break;
            }else if(R > W){
                System.out.println(R-1);
                break;
            }else{
                System.out.println(W);
                break;
            }
        }
    }
    public static int getR(String stone,int start){
        char[] c = stone.toCharArray();
        int Rcount = 0;
        int Wcount = 0;
        for(int i=start+1; i<stone.length();i++ ){
            if(c[i] == 'R'){
                Rcount ++;
            }
        }
        for(int i=0; i<=start;i++ ){
            if(c[i] == 'W'){
                Wcount ++;
            }
        }
        return Rcount;
    }
    public static int getW(String stone,int start){
        char[] c = stone.toCharArray();
        int Wcount = 0;
        for(int i=0; i<start;i++ ){
            if(c[i] == 'W'){
                Wcount ++;
            }
        }
        return Wcount;
    }
}
