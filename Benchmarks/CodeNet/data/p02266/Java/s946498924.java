import java.util.ArrayList;
import java.util.Scanner;

/**
 * ACSD
 */
public class Main {
    // 現在のx座標
    public int lineNumber;

    // 現在の 層別未確定水たまりスタック
    public ArrayList<Integer> stack;
    // 未確定水たまり層の始点
    public ArrayList<Integer> stackStart;
    // 確定水たまりリスト
    public ArrayList<Integer> puddles;
    // 確定水たまり層の始点
    public ArrayList<Integer> puddleStart;
    // 現在の確定水たまりIdx
    public int puddleNumber = 0;
    // 現在の深さ
    public int currentDepth = 0;
    // 前回の水たまり水面高
    public int prevPuddleHeight = -1;

    public int sum = 0;

    /**
     * 指定の層へ水を追加する
     *
     * @param idx       追加する層Idx
     * @param n         追加量
     * @param isConfirm 層確定操作を行うかどうか
     */
    public void add(int idx, int n, boolean isConfirm) {
        // 初出層の場合はstackに追加
        if (this.stack.size() - 1 < idx) {
            this.stack.add(idx, 0);
            this.stackStart.add(idx, lineNumber);
        }
        // 追加動作
        this.stack.set(idx, (this.stack.get(idx) + n));
        // 層確定操作
        if (isConfirm) {
            this.sum += this.stack.get(idx);
            // 現在の未確定水たまり層を、確定水たまりリストに移す
            this.puddles.add(puddleNumber, this.stack.get(idx) / 2);
            // 追加した確定水たまりの始点も設置
            this.puddleStart.add(puddleNumber, this.stackStart.get(idx));
            // 初回の層確定操作でない && 前回の層確定操作の1つ上位層の場合
            if ((prevPuddleHeight != -1) && ((prevPuddleHeight - 1) == idx)) {
                // 繰り上がり動作を行う
                // 各確定水たまりについて、初めて (現在の水たまりの始点) < (ある水たまり始点) となるものを探す
                int start = this.puddleStart.get(puddleNumber);
                for (int i = 0; i <= puddleNumber; i++) {
                    // (現在の水たまりの始点) < (ある水たまり始点) Hit!!
                    if (start < this.puddleStart.get(i)) {
                        // ある地点の水たまりを吸収
                        // はじめに始点を更新
                        this.puddleStart.set(i, start);
                        // 次に、その間の水たまり量をすべて吸収
                        for (int j = i + 1; j <= puddleNumber; j++) {
                            this.puddles.set(i, this.puddles.get(i) + this.puddles.get(j));
                        }
                        for (int j = puddleNumber; j >= i + 1; j--) {
                            this.puddles.remove(j);
                            this.puddleStart.remove(j);
                        }
                        puddleNumber = i + 1;
                        break;
                    }
                }
            } else { // 繰り上がり動作を行わない場合
                puddleNumber++;
            }
            prevPuddleHeight = idx;
            this.stack.remove(idx);
            this.stackStart.remove(idx);
        }
    }

    public void up() {
        if (currentDepth == 0) {
            return;
        }
        currentDepth--;
        this.add(currentDepth, 1, true);
        for (int i = 0; i < currentDepth; i++) {
            this.add(i, 2, false);
        }
    }

    public void hori() {
        for (int i = 0; i < currentDepth; i++) {
            this.add(i, 2, false);
        }
    }

    public void down() {
        for (int i = 0; i < currentDepth; i++) {
            this.add(i, 2, false);
        }
        this.add(currentDepth, 1, false);
        currentDepth++;
    }

    public void print() {
        System.out.println(sum / 2);
        System.out.print(this.puddles.size());
        int len = this.puddles.size();
        for (int i = 0; i < len; i++) {
            System.out.print(" " + (this.puddles.get(i)));
        }
        System.out.println();
    }

    public void go() {
        this.stack = new ArrayList<Integer>();
        this.stackStart = new ArrayList<Integer>();
        this.puddles = new ArrayList<Integer>();
        this.puddleStart = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        String[] strings = line.split("");
        for (int i = 0; i < strings.length; i++) {
            String s = strings[i];
            this.lineNumber = i;
            switch (s) {
            case "\\":
                this.down();
                break;
            case "_":
                this.hori();
                break;
            case "/":
                this.up();
                break;
            }
        }
        print();
    }

    public static void main(String[] args) {
        Main cui = new Main();
        cui.go();
    }
}
