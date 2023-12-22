import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	int num = 1;
      	for(int i=0;i<9;i++){
          	if(N-111>0){
            	N -= 111;
            }else{
            	num += i;
              	break;
            }
        }
        System.out.println(num*111);
    }
}