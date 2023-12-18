import java.util.Scanner;

class Main {

    int size;
    int cs;
    int[] coins;

    int min = 999999;

    public void go() {
        Scanner sc = new Scanner(System.in);
        this.size = sc.nextInt();
        this.cs = sc.nextInt();
        this.coins = new int[cs];
        for (int i = 0; i < this.coins.length; i++) {
            this.coins[i] = sc.nextInt();
        }
        for (int i = 0; i < this.coins.length; i++) {
            for (int j = i + 1; j < this.coins.length; j++) {
                if (this.coins[i] < this.coins[j]) {
                    int tmp = this.coins[i];
                    this.coins[i] = this.coins[j];
                    this.coins[j] = tmp;
                }
            }
        }
        this.calc(0, this.size);
        System.out.println(this.min);
    }

    public void calc(int count, int remain) {
        if (this.min <= count) {
            return;
        } else if (remain == 0) {
            if (count < this.min) {
                this.min = count;
            }
            return;
        } else {
            for (int i = 0; i < this.coins.length; i++) {
                if (this.coins[i] <= remain) {
                    this.calc(count + 1, remain - this.coins[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.go();
    }
}
