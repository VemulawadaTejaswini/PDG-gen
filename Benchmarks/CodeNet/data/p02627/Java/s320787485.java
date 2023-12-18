import java.util.Scanner;

/**
 * <p>ClassName:  </p>
 * <p>Description: </p>
 * <p>Company: </p>
 *
 * @author zhangyong
 * @version 1.0.0
 * @date 2020/6/24 20:46
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Character a=str.charAt(0);
        if (a.charValue()>='A'&&a.charValue()<='Z'){
            System.out.println('A');
        }else if (a.charValue()>='a'&&a.charValue()<='z'){
            System.out.println('a');
        }
    }
}
