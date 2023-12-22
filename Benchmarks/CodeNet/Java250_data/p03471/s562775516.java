import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int n = sc.nextInt();
        int y = sc.nextInt() / 1000;
        int one = 0,five = 0,ten = n;
        int check;
        try{
        while(one * 1 + five * 5 + ten * 10 != y){
          if(one * 1 + five * 5 + ten * 10 > y){
            ten--;
            one++;
          }else if(one * 1 + five * 5 + ten * 10 < y){
            one--;
            five++;
          }
          if(one < 0 || five < 0 || ten < 0){
            throw new Exception();
          }
        }    
          System.out.println(ten + " " + five + " " + one);
        }catch(Exception e){
          System.out.println(-1 + " " + -1 + " " + -1);
        }
    }
}