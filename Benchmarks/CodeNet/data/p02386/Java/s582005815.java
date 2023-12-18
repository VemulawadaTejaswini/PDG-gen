import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();

		Dice[] ds = new Dice[n];

		for (int i=0; i < n; i++) {
			 String[] label = sc.nextLine().split(" ");
			 ds[i] = new Dice(label);
		}

//		char[] order = "RRRR_SEEE_LSSS_LWWW_LNNN_WLLL".toCharArray();

		boolean flag = true; // flag :all dices are different ?
		loop:
		for (int i=0; i < n; i++) {
			for (int j=i+1; j < n; j++) {

				if ( ds[i].equiv(ds[j]) ) {
					flag = false;
					break loop;
				}

			}
		}

		if (flag) System.out.println("Yes");
		else System.out.println("No");

	}

	static class Dice {
		String top, front, right, left, back, bottom;

		Dice(String[] label) {
			top = label[0];
			front = label[1];
			right = label[2];
			left = label[3];
			back = label[4];
			bottom = label[5];
		}

		Dice move(char c) {
			String temp;
			switch (c) {
			case 'N': // top <- front <- bottom <- back <- top
				temp = top;
				top = front;
				front = bottom;
				bottom = back;
				back = temp;
				break;
			case 'E': // top <- left <- bottom <- right <- top
				temp = top;
				top = left;
				left = bottom;
				bottom = right;
				right = temp;
				break;
			case 'S': // top <- back <- bottom <- front <- top
				temp = top;
				top = back;
				back = bottom;
				bottom = front;
				front = temp;
				break;
			case 'W': // top <- right <- bottom <- left <- top
				temp = top;
				top = right;
				right = bottom;
				bottom = left;
				left = temp;
				break;
			case 'R': // front <- right <- back <- left <- front
				temp = front;
				front = right;
				right = back;
				back = left;
				left = temp;
				break;
			case 'L': // front <- left <- back <- right <- front
				temp = front;
				front = left;
				left = back;
				back = right;
				right = temp;
				break;
			}
			return this;
		}

		boolean match(Dice that) {
			boolean b0 = this.top.equals(that.top);
			boolean b1 = this.front.equals(that.front);
			boolean b2 = this.right.equals(that.right);
			boolean b3 = this.left.equals(that.left);
			boolean b4 = this.back.equals(that.back);
			boolean b5 = this.bottom.equals(that.bottom);

			if (b0 && b1 && b2 && b3 && b4 && b5) return true;
			else return false;
		}

		boolean equiv(Dice that) {

			/* ????????¢??????????????????????????¢???top,front,right,left,back,bottom???
			 * ????????????????????????????????¶?????????????????????????????????????????????????????????
			 * ?????¢??????????????????????????????????????¨?????????????????????6*4???24??????????????????
			 * initial state(top) -> S(front) -> L(right) -> L(back) -> L(left) -> W(bottom)
			 */
			char[] order = ("RRRR" + "SEEE" + "LSSS" + "LWWW" + "LNNN" + "WLLL").toCharArray();

			boolean flag = false;
			for (int i=0; i < order.length; i++) {
				that.move(order[i]);
				if (  this.match(that)  ) {
					flag = true;
					break;
				}
			}

			return flag;
		}
	}

}