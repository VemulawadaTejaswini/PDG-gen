import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sca01 = new Scanner(System.in);
		String something = sca01.next();

		if(something.endsWith("s") == true){
			something = something + "es";
		}else{
			something = something + "s";
		}
		System.out.println(something);

	}
}
