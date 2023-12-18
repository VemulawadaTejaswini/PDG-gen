import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		while(true){
			Scanner sc = new Scanner(System.in);
			int playerNum = sc.nextInt();//プレイヤー数
			ArrayList<Integer> restPlayer= new ArrayList<Integer>();//残りのプレイヤー
			for(int i=1;i<=playerNum;i++){
				restPlayer.add(i);
			}
			int remarkNum = sc.nextInt();//発言数
			if(playerNum==0 && remarkNum ==0){
				break;
			}
			String[] remark = new String[remarkNum];
			for(int i=0;i<remarkNum;i++){
				remark[i] = sc.next();
			}
			int nowPlayer = 1;
			for(int i=0;i<remarkNum;i++){
				if(((i+1)%3==0) && ((i+1)%5==0)){//3と5で割り切れて、発言がFizzBuzzでなければプレイヤーを消す
					if(!(remark[i].equals("FizzBuzz"))){
						restPlayer.remove((Object)nowPlayer);
					}
				}else if((i+1)%3==0){//3で割り切れて、発言がFizzでなければプレイヤーを消す
					 if(!remark[i].equals("Fizz")){
						restPlayer.remove((Object)nowPlayer);
					 }
				}else if((i+1)%5==0){//5で割り切れて、発言がBuzzでなければプレイヤーを消す
					 if(!remark[i].equals("Buzz")){
						restPlayer.remove((Object)nowPlayer);
					 }
				}else if(!((i+1)==Integer.parseInt(remark[i]))){//発言した回数と発言した数字が違っていれば、プレイヤーを消す
					restPlayer.remove((Object)nowPlayer);
				}
				restPlayer.trimToSize();
				if(restPlayer.size() == 1){
					break;
				}
				nowPlayer++;
				if(nowPlayer > playerNum){
					nowPlayer=1;
				}
			}
			Integer[] restPlayerArray = restPlayer.toArray(new Integer[restPlayer.size()]);
			for(int i=0;i<restPlayerArray.length;i++){
				System.out.print(restPlayerArray[i]+" ");
			}
		}
	}
}