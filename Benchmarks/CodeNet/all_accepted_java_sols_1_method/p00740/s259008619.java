import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        for(;;){
            int n = in.nextInt(), p = in.nextInt();
            if(n==0 && p==0) return ;
            int cup = p, pos = 0;
            int ns[] = new int[n];
            for(;;){
                if(cup>0){
                    ns[pos]++;
                    if(ns[pos]==p) break;
                    cup--;
                }
                else{
                    cup += ns[pos];
                    ns[pos] = 0;
                }
                pos = (pos+1)%n;
            }
            System.out.println(pos);
        }
    }
}