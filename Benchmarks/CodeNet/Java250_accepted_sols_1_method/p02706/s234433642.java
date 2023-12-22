import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
      	String num = sc.nextLine();
		String[] data = line.split(" ");
      	String[] num2 = num.split(" ");
      	Integer sum = 0;
      	for(int i = 0; i < Integer.parseInt(data[1]); i++){
          sum += Integer.parseInt(num2[i]);
        }
		Integer nokori = Integer.parseInt(data[0]) - sum;
      if(nokori < 0){
        System.out.println(-1);
      }else{
        System.out.println(nokori);
      }
	}
}