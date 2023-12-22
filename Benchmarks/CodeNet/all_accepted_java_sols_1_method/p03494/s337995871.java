import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
        int count = Integer.MAX_VALUE;
       
        Parent: for(int i = 0; i < n; i++) {
          int value = sc.nextInt();
          String[] bin = Integer.toBinaryString(value).split("");
          Child: for(int index = 0; index < bin.length; index++) {
            if (bin[bin.length - 1 - index].equals("1")) {
              if (index < count) {
                count = index;
              }
              break Child;
            }
          }
        }
		System.out.println(count);
	}
}