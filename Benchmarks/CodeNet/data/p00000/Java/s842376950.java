import java.util.function.BiFunction;

public class QQ {

	private static final int MAX_NUM = 9;

	public static void main(String[] args)
	{
		BiFunction<Integer, Integer, String> qq = (Integer num1, Integer num2) ->
			{return num1 +"x" + num2 + "=" + (num1 * num2);};

		for(int i = 1; i <= MAX_NUM; i++){
			for(int j = 1; j <= MAX_NUM; j++){
				System.out.println(qq.apply(i,j));
			}
		}
	}

}