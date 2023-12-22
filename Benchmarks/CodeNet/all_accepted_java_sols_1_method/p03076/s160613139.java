import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
        int e = sc.nextInt();
      	List<Integer> list = new ArrayList<Integer>();
        List<Integer> numList = new ArrayList<Integer>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        int num = 0;
        int min = 10;
        int check = 0;
        for(int i=0; i<5; i++){
          num = list.get(i);
          if(num >= 100) num = num % 100;
          if(num >= 10) num = num % 10;
          if(num == 0) num = 10;
          numList.add(num);
          if(num < min) {
            min = num;
            check = i;
          }
        }
        int sum = 0;
        for(int i=0; i<5; i++){
          if(i == check) continue;
          sum += (list.get(i)+(10-numList.get(i)));
        }
        sum += (list.get(check));
     System.out.println(sum);
	}
}