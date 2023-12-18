import java.util.Scanner;

class Main {
	public static void main(String[] a) {
		Scanner scanner = new Scanner(System.in);
		
		RightTriangle[] triangle = new RightTriangle[scanner.nextInt()];
		
		for(int i = 0; i < triangle.length; i++) {
			triangle[i] = new RightTriangle(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
		}
		
		for(int i = 0; i < triangle.length; i++) {
			System.out.println(triangle[i].judge());
		}
		
	}
}

class RightTriangle {
	private int hypotenuse;
	private int side;
	private int otherside;
	
	public RightTriangle(int x, int y, int z) {
	  if(x < y) {
	  	int temp = x;
	  	x = y;
	  	y = temp;
	  }
	  if(x < z) {
	  	int temp = x;
	  	x = z;
	  	z = temp;
	  }
	  hypotenuse = x;
	  side = y;
	  otherside = z;	  
	}
	
	public String judge() {
		boolean judge = (hypotenuse * hypotenuse == side * side + otherside * otherside);
		if(judge) {
		  return "YES";
		} else {
			return "NO";
		}
	}
}