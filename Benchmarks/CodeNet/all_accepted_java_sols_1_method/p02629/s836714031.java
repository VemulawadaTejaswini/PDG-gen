import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long n = sc.nextLong();
      	ArrayList<Character> name = new ArrayList<>();

      	for(;n>0;){
         n -= 1;
         name.add((char)(n%26+97));
         n /= 26;
        }
      	String dog = "";
      	for(int i=name.size()-1;i>=0;i--){
          dog += String.valueOf(name.get(i));
        }
		// 出力
		System.out.println(dog);
	}
}