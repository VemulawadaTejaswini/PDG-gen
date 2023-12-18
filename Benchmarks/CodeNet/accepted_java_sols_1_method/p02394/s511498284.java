import java.util.Scanner;

public class Main { 
	public static void main(String[] args){
		String str;
                int[] arr = new int[5];
                int i, j, temp;
 
                // 5????????°??????????????????
                Scanner scan = new Scanner(System.in);
                str = scan.next();
                arr[0] = Integer.parseInt(str);
                str = scan.next();
                arr[1] = Integer.parseInt(str);
                str = scan.next();
                arr[2] = Integer.parseInt(str);
                str = scan.next();
                arr[3] = Integer.parseInt(str);
                str = scan.next();
                arr[4] = Integer.parseInt(str);

                // 
                if(arr[2]-arr[4]>=0 && arr[3]-arr[4]>=0 && arr[2]+arr[4]<=arr[0] && arr[3]+arr[4]<=arr[1])
                        System.out.println("Yes");
                else
                        System.out.println("No");
	}
}