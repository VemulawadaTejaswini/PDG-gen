public class Xcube{

	public static void main(String[] args){
		int x = 0;

		try{
			x = Integer.parseInt(args[0]);
		}
		catch(NumberFormatException e){
			System.out.println(args[0] + "?????´??°??§??????????????????");
			System.exit(1);
		}

		System.out.println(x * x * x);

	}
}