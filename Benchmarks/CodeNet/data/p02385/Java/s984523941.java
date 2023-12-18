
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Cube cube01 = new Cube(br);
		Cube cube02 = new Cube(br);
		
		
		
		//char[] act = br.readLine().toCharArray();
		//cube.roll(act);
		//int count = Integer.parseInt(br.readLine());
		//for(int i = 0; i < count; i++){
		boolean ans = cube01.trace(cube01,cube02);
			if(ans == true){
				System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
		//}
		//System.out.println(cube.top);
	}
}

class Cube {
	String[] num;
	String top;
	String center;
	String back;
	String bottom;
	String right;
	String left;
	String temp;

	Cube(BufferedReader br) throws IOException {
		num = br.readLine().split(" ");
		this.top = num[0];
		this.center = num[1];
		this.right = num[2];
		this.left = num[3];
		this.back = num[4];
		this.bottom = num[5];
	}

	void south() {
		temp = this.top;
		this.top = this.back;
		this.back = this.bottom;
		this.bottom = this.center;
		this.center = temp;
	}

	void north() {
		temp = this.top;
		this.top = this.center;
		this.center = this.bottom;
		this.bottom = this.back;
		this.back = temp;
	}

	void east() {
		temp = this.top;
		this.top = this.left;
		this.left = this.bottom;
		this.bottom = this.right;
		this.right = temp;
	}

	void west() {
		temp = this.top;
		this.top = this.right;
		this.right = this.bottom;
		this.bottom = this.left;
		this.left = temp;
	}

	void roll(char[] act) {
		for (int i = 0; i < act.length; i++) {
			switch (act[i]) {
			case 'S':
				south();
				break;
			case 'N':
				north();
				break;
			case 'E':
				east();
				break;
			case 'W':
				west();
				break;
			}
		}
	}
	
	void turnRight(){
		temp = this.center;
		this.center = this.left;
		this.left = this.back;
		this.back = this.right;
		this.right = temp;
	}
	
	void search(BufferedReader br) throws IOException {
		
		String[] numList = br.readLine().split(" ");
		for (int i = 0; i < 6; i++) {
			if (i == 3) {
				this.east();
				}
			if (numList[1].equals(this.center)){
				break;
				} else {
				this.north();
				}
		}
		while (true) 
			if (numList[0].equals(this.top)) {
				break;
				} else {
				this.west();
				}
		System.out.println(right);
	}
	
	void setUpside(int top,Cube cube) throws IOException{
		
		for(int i = 0; i < 7; i++){
			if(cube.top.equals(top)){
				break;
			}
			if(i == 3){
				cube.east();
				
			}
			cube.north();	
		}
	}

	boolean trace(Cube cube01, Cube cube02) {

		boolean ans = false;
		if (cube02.right.equals(cube01.right) && cube02.center.equals(cube01.center) && cube02.left.equals(cube01.left)
				&& cube02.back.equals(cube01.back) && cube02.bottom.equals(cube01.bottom)) {
			ans = true;
			return ans;

		} else {

			for (int i = 0; i < 7; i++) {
				cube02.north();
				if (cube02.top.equals(cube01.top)) {
					for (int j = 0; j < 4; j++) {
						cube02.turnRight();
						if (cube02.right.equals(cube01.right) && cube02.center.equals(cube01.center)
								&& cube02.left.equals(cube01.left) && cube02.back.equals(cube01.back)
								&& cube02.bottom.equals(cube01.bottom)) {
							ans = true;
							break;
						}
						if (j == 4) {
							break;
						}
					}
					break;
				}
				if (i == 3) {
					cube02.east();
				}
			}
			return ans;
		}
	}
}