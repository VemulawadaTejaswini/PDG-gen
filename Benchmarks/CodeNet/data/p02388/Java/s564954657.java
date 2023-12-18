public class Main {
	public static void main(String[] args){
		if(args.length == 1){
			int num = Integer.parseInt(args[0]);
			xCube xc = new xCube(num);
		}else{
			System.out.println("引数が不正です。");
		}
	}

}

public class xCube {
	xCube(int num){
		System.out.println(num*num*num);
	}

}