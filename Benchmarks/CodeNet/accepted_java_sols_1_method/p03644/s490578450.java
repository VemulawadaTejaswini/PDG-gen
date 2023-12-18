import java.util.*;

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int n = Integer.parseInt(sc.next());
      	int[] list = { 1, 2, 4, 8, 16, 32, 64 };
      	
		int size = list.length;
      	int right = size;
      	int left = 0;
      	while (left + 1 != right) {
          if (n >= (list[(right + left) / 2])) left = (right + left) / 2;
          else right = (right + left) / 2;
        }
      	System.out.println(list[left]);
    }
}