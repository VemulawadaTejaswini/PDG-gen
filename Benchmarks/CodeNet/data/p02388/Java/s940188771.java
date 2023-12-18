public class Main {
	public static void main(String[] args){
		if(args.length == 1){
			int num = Integer.parseInt(args[0]);
			System.out.println((int)Math.pow(num, 3));
		}else{
			System.out.println("引数が不正です。");
		}
	}

}