import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int k = stdIn.nextInt();
        int[] r = new int[k];
        int[] c = new int[k];
        for(int i=0; i<k; i++){
            r[i] = stdIn.nextInt();
            c[i] = stdIn.nextInt();
        }

        boolean[] fixed = new boolean[8];
        int[] save = new int[8];
        for(int i=0; i<r.length; i++){
            fixed[r[i]] = true;
            save[r[i]] = c[i];
        }

        int[] seed = new int[8-k];
        int index = 0;
        Outer:
        for(int i=0; i<8; i++){
            for(int j=0; j<c.length; j++){
                if(i == c[j]){
                    continue Outer;
                }
            }
            seed[index++] = i;
        }

        Permutation p = new Permutation(seed);

        while(true){
            int[] fixedArray = new int[8];
            int[] permArray = p.getPerm();
            
            int idx = 0;
            for(int i=0; i<fixedArray.length; i++){
                if(fixed[i]){
                    fixedArray[i] = save[i];
                }else{
                    fixedArray[i] = permArray[idx++];
                }
            }

            if(isDiagonalyExclusive(fixedArray)){
                print8Queen(fixedArray);
                break;
            }

            p.next();
        }
    }

    static boolean isDiagonalyExclusive(int[] a){
        for(int i=0; i<a.length-1; i++){
            for(int j=i+1; j<a.length; j++){
                if((i - j) == (a[i] - a[j]) || (i - j) == (a[j] - a[i])){
                    return false;
                }
            }
        }
        
        return true;
    }

    static void print8Queen(int[] a){
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                if(a[i] == j){
                    System.out.print("Q");
                }else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}

class Permutation{
    int[] seed;
    int[] perm;

    public Permutation(int [] seed){
        this.seed = new int[seed.length];
        for(int i=0; i<this.seed.length; i++){
            this.seed[i] = seed[i];
        }

        this.perm = new int[seed.length];
        for(int i=0; i<this.perm.length; i++){
            this.perm[i] = seed[i];
        }
        sort(this.perm, 0, this.perm.length);
    }

    public int[] getPerm(){
        return this.perm;
    }

    public boolean next(){
        for(int i=perm.length-1; i>0; i--){
            if(perm[i] > perm[i-1]){
                changePerm(i);
                return true;
            }
        }

        return false;
    }

    private void changePerm(int index){
        int targetIndex = index;
        int min = Integer.MAX_VALUE;
        for(int i=index; i<perm.length; i++){
            if(min > perm[i] && perm[index-1] < perm[i]){
                min = perm[i];
                targetIndex = i;
            }
        }

        int temp = perm[index - 1];
        perm[index - 1] = perm[targetIndex];
        perm[targetIndex] = temp;

        sort(perm, index, perm.length);
    }

    private void sort(int[] a, int from, int to){
        for(int i=from; i<to; i++){
            int x = a[i];
            int j = i;
            while(j > from && a[j-1] > x){
                a[j] = a[j-1];
                j--;
            }
            perm[j] = x;
        }
    }
}

