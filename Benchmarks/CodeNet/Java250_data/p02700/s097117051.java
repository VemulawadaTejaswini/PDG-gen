import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//数値の入力
		int a = sc.nextInt();
      	int b = sc.nextInt();
      	int c = sc.nextInt();
      	int d = sc.nextInt();
      	
      	//高橋が青木に攻撃
      	int AoCount =0;
      	while(c > 0){
          c -= b; 
          AoCount ++; 
        }
      	
      	//青木が高橋に攻撃
      	int TkCount =0;
      	while(a > 0){
          a -= d; 
          TkCount ++; 
        }

      	if(TkCount<AoCount){
        System.out.println("No");
      }else{
        System.out.println("Yes");
      }
    }
}