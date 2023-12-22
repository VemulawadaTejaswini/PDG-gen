import java.util.Scanner;

public class Main {

    private static final int GOAL_BUTTON = 2;

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Button[] buttons = new Button[n];

        for (int i = 0; i < n; i++) {
            Button bt = new Button(sc.nextInt());

            // ボタン1が初期で光っている
            if (i == 0) {
                bt.push();
            }

            buttons[i] = bt;
        }

        int next = buttons[0].push();
        int pushCount = 1;

        while (true) {
            if (next == GOAL_BUTTON) {

                // 押した結果光ったのが2なら終了
                System.out.println(pushCount);

                return;
            }

            if (buttons.length < next) {
                System.out.println(-1);

                return;
            }

            // 次に押すボタン
            Button targetButton = buttons[next - 1];

            // 押されたボタンを再度押すと無限に続くため2は光らせられない
            if (targetButton.isPushed()) {
                System.out.println(-1);

                return;
            } else {

                // 押されてなければ押して回数を加算
                next = targetButton.push();
                ++pushCount;
            }
        }
	}
}

class Button {

    /** 光らせるボタン */
    private int target;

    /** 光っているかどうか */
    private boolean on;

    /** 押された（光らせたか）どうか */
    private boolean pushed;

    public Button(int target) {
        this.target = target;
        on = false;
    }

    /** ボタンを押して光っている状態を反転後、光るボタンを返す */
    public int push() {
        on = !on;

        if (on) {
            pushed = true;
        }

        return target;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public boolean isOn() {
        return on;
    }

    public boolean isPushed() {
        return pushed;
    }
}