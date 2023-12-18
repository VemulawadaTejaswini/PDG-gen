import java.util.Scanner;

public class Main {

    public int size;
    public int[] mx;

    public void scan() {
        Scanner sc = new Scanner(System.in);
        this.size = sc.nextInt();
        this.mx = new int[this.size];
        for (int i = 0; i < this.size; i++) {
            this.mx[i] = sc.nextInt();
        }
    }

    public void task() {
        int min = this.mx[0];
        int max = this.mx[1] - this.mx[0];
        for(int i = 1; i < this.size; i++){
            if(max < this.mx[i] - min){ max = this.mx[i] - min; }
            if(min > this.mx[i]){ min = this.mx[i]; }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Main prime = new Main();
        prime.scan();
        prime.task();
    }
}
