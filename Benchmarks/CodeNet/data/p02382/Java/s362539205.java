import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        // fill in the dictionary with the initial value
        int len = f.nextInt();
        int[] one = new int[len];
        int[] two = new int[len];
        double euc = 0;
        double man = 0;
        double cheb = 0;
        double min = 0;
        // Read in values
        for(int i = 0; i < len; i++){
            one[i] = f.nextInt();
        }
        for(int i = 0; i < len; i++){
            two[i] = f.nextInt();
        }
        for(int i = 0; i < len; i++){
            man +=(double) Math.abs(one[i] - two[i]);

        }
        Minkoswki minkoswki = new Minkoswki(one,two);
        System.out.println(minkoswki.calcDist(1));
        System.out.println(minkoswki.calcDist(2));
        System.out.println(minkoswki.calcDist(3));
        System.out.println(minkoswki.chebyshev());
    }
}
class Minkoswki{
    public int[] one;
    public int[] two;
    Minkoswki(int[] one, int[] two){
        this.one = one;
        this.two = two;
    }

    public double calcDist(int p){
        double sum = 0;
        for(int i = 0; i < this.one.length; i++){
            sum += (double) Math.pow(Math.abs(this.one[i] - this.two[i]),p);
        }
        return Math.pow(sum, (1.0/p));
    }
    public double chebyshev(){
        double max = 0;
        for(int i = 0; i < this.one.length; i++){
            max = Math.max(max, Math.abs(this.one[i] - this.two[i]));
        }
        return max;
    }
}
