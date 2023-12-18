import java.util.*;

class Pair{
    int H,W;
    Pair(int H,int W){
        this.H = H;
        this.W = W;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pair> list = new ArrayList<Pair>();
        while(true){
            int H=sc.nextInt(),W=sc.nextInt();
            if(H==0&&W==0){
                break;
            }
            Pair p = new Pair(H,W);
            list.add(p);
        }
        for(int i=0;i<list.size();i++){
            Pair p = list.get(i);
            for(int j = 0;j < p.H ; j++){
                for(int k = 0;k < p.W;k++){
                    if(j==0||j==p.H-1||k==0||k==p.W-1){
                        System.out.print("#");
                    }else{
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

